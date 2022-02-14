#  Yeni bir feature file olusturalim:
##  US1004_Walmart_parameter_arama.feature
# # Yeni bir Scenario olusturalim:
# # TC07_aranan_kelime_title'da_olmali
# # Nutella, pencil, milk, tomatoes ve popcorn ile
# # arama yapip sonuclari test edin
  @ama
  Feature: US1004_Wamaert_parameter_arama

    Scenario Outline: TC01_arama_kelime_title

      Given kullanici "AmazonUrl" sayfasina gider
      When arama butonuna tiklar
      And "<aramalar>" icin arama yapar
      And sonuclarin "<aramalar>" icerdigini test eder
      And sayfayi kapatir




      Examples:
        |aramalar  |
        |Nutella   |
        |Pencil    |
        |milk      |
        |biky  |
        |popcorn   |

