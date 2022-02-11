@wig
Feature: Login Test
  Scenario: Go to amazon website and test login page

    Given Amazon sitesine git
    And login butonuna tikla
    And isim gir
    And sifre gir
    When submit butonuna tikladigimda
    Then success mesajini verify et

    # given baslangic kodu
   # and olaylar kodunu
   #when olaylar kodu
   # Then ile de sonuc
   # stepDefinitions ile calisir feature
  # konsolda benim steplerimin adimalrini verdi,burdaki stepleri stepdefinition ile bagladik
  # eger yinede hata verirse farkli bir stepdefinition acip icindekielri oraya tasirsak calisir
  # cucumber da bu hata bazen olan bir durumdur