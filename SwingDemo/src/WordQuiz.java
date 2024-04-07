import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz extends JFrame{
    private JPanel QuizPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel questionLabel;
    private JLabel statementLabel;
    private JLabel streakLabel;
    private String english;
    private int streak=0;


    WordQuiz() throws SQLException {
        add(QuizPanel);
        setSize(500, 300);
        setTitle("WordQuiz");

        getQuestion();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button1,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button2,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button3,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button4,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }


    private void getQuestion() throws SQLException{
        SelectQuery selectQuery = new SelectQuery();
        selectQuery.SelectQuesiton();
        String turkish = selectQuery.getTurkish();
        english = selectQuery.getEnglish();

        //kelimeleri getir
        selectQuery.selectAndShuffleEnglishWords();
        String englishOne = selectQuery.getEnglishOne();
        String englishTwo = selectQuery.getEnglishTwo();
        String englishThree = selectQuery.getEnglishThree();

        //rastgele atama için listeler oluştur
        JButton[] buttons = {button1, button2, button3, button4};
        String[] variables = {english, englishOne, englishTwo, englishThree};

        //değişkenleri karıştır
        List<String> variableList = Arrays.asList(variables);
        Collections.shuffle(variableList);

        //atamayı yap
        questionLabel.setText(turkish);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText(variables[i]);
        }
    }

    private void checkAnswer(JButton selectedButton, String correctAnswer) throws SQLException {
        if (selectedButton.getText().equals(correctAnswer)){
            statementLabel.setText("Doğru cevap");
            streak+=1;
            streakLabel.setText("Art arda Doğru sayısı: " + streak);
            getQuestion();
        }else{
            statementLabel.setText("Yanlış cevap! Doğrusu => " + correctAnswer);
            streak=0;
            streakLabel.setText(String.valueOf(streak));
            getQuestion();
        }
    }
}
