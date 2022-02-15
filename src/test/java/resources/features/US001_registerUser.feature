Feature: Register_User_Functionality


  register
  Scenario: TC01_register_page (kayit sayfasi)
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    And kullanici,New User Signup! in gorunur oldugunu test eder





  Scenario: TC02_signup_user (kayitli kullanici)

    When kullanici olarak isim ve maili girer
    Then signup butonuna tiklar
    Then acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder
    Then  kullanici ayrintilari(birinci bolum) doldurur





  Scenario: TC03_delete_account (hesap silme)