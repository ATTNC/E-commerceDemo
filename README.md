# E-Ticaret Simülasyonu

E-ticaret sisteminde sisteme kayıt ve sisteme girişi simüle etmek üzerine bir çalışma yapılmıştır. Kullancılar sisteme temel bilgilerle (ad, soyad, email, şifre) kayıt olabilmektedirler. İsterlerse Google hesaplarıyla da kayıt olmaları mümkündür (Simülasyon).

## Projenin Bilgisi
Sisteme kullancı bilgilerini giriyoruz. Burada 3. kullanıcının email bilgisi hatalı sonucu simüle etmek için 1. kullanıcıyla aynı verilmiştir.

<img src= "https://github.com/ATTNC/E-commerceDemo/blob/main/eCommerce/ScreenShots/Users1.jpg" width=600> 

Sisteme hibernate seçeneğini kullanarak kayıt oluşturuyoruz. Başarılı şekilde kayıt olduğumuz sonucunu alıyoruz ve E-mail'imize onay e-postası geliyor. Tıklarayak onaylıyoruz (Simülasyon). Son olarak Hibernate ile kayıt olduğumuzu görüyoruz.     

<img src= "https://github.com/ATTNC/E-commerceDemo/blob/main/eCommerce/ScreenShots/Output1.jpg"  width=400>

Aynı şekilde sisteme Google seçeniğiyle kayıt oluşturuyoruz.

<img src= "https://github.com/ATTNC/E-commerceDemo/blob/main/eCommerce/ScreenShots/registerWithGoogle.jpg" width=400>

Login yaparak kullanıcı bilgilerimizi doğruluyoruz eğer girmiş olduğumuz kullanıcı bilgilerimiz doğruysa sisteme giriş yapıyoruz.

<img src= "https://github.com/ATTNC/E-commerceDemo/blob/main/eCommerce/ScreenShots/user1Login.jpg" width=250>

Kullanıcı 2 için hatalı giriş denemesi:

<img src= "https://github.com/ATTNC/E-commerceDemo/blob/main/eCommerce/ScreenShots/user2WrongLogin.jpg" width=300>

Kullanıcı 3 için email bilgisini kullanıcı 1 ile aynı vermiştik. Çıktı olarak :

<img src= "https://github.com/ATTNC/E-commerceDemo/blob/main/eCommerce/ScreenShots/emailUsed.jpg" width=500>

Sonucunu görüyoruz.
