git = 'git commit -m "enter your message"'
gitAdd = '(git add .) yapıldığında tüm dosyaları add yapıyoruz.'
gitLog = 'git log ile termina üzerinde değişiklikleri görebiliyoruz.'
gitIgnore = '.gitignore adlı bir dosya açıp içerisinde ilgili dosyayı yazabiliyoruz. örn gizli.txt veya .txt yazarak ilgili uzantıya sahip tüm dosyaları engeller.'
gitBr = 'git branch yazarak mevcut branchleri görüntülüyoruz. git branch "yeni" bu komut yeni isimli bir branch oluşturur. (git switch yeni) dersem de o branche geçerim'
kendimeNot = "master branchindekiler yeni açılan branchlere geçerler. Yeni branchler ile birleştirmek için git switch master diyerek ana branche geçeriz"
Not2 = "Eğer farklı bir branchte yeni bir dosya kod yazarsam tekrar ana branche geçtiğimde o dosya veya kodları göremem. Tekrardan ilgili branche geçersem görürüm"
fstforward = "Eğer yeni bir branch açsaydım ve sadece aynı dosya üzerinde değişiklik yapıp merge etseydim buna Fast Forward deniyor. Zaten branch açmasam da aynı noktaya getirecekti beni"
fstforward2 = "Veya aynı klasör içine farklı bir dosya kaydedip merge etseydim yine bir çakışma olmayacak buna da yine Fast Forward diyeceğiz"
conflict = "Eğer aynı dosya üzerinde bir branchte farklı diğerinde farklı değişiklikler yapsam bunlar çakışacak yani conflict meydana gelecek"
restore="Commit etmeden başka bir branche geçmek istiyoruz diyelim bu durumda değişiklikler geçtiğimiz branchte de görünecektir. Bunun olmasını istemiyorsak git status ten sonra git restore (ilgili dosya) yazarak o değişikliği geri alırız"
"""
restore edip değişiklikleri kaldırmak yerine stash(zulala) yapabiliriz. İlgili değişikliği yaptıktan sonra git stash ile kodu zulaya atarız
bu zula dosyada görünmez. git stash list yaparsak stashlediğimiz kodları görebiliriz.
Bu kodları çıkarmak istediğimizde git stash pop yaparak ilgili dosyaya geri dönmesini sağlayabiliriz. 
"""

