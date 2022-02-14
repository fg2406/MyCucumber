package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

   AmazonPages amazonPages=new AmazonPages();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenUrl) {
      Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String aramalar) {
       amazonPages.aramaKutusu.sendKeys(aramalar);

    }

    @Given("sonuclarin \\{String} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder() {

    }


    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String aramalar)
    {Assert.assertTrue(amazonPages.sonucYazisiElementi.getText().contains(aramalar));


    }

      @And("sayfayi kapatir")
     public void sayfayiKapatir() {
       Driver.closeDriver();

 }

    @When("arama butonuna tiklar")
    public void aramaButonunaTiklar() {
    amazonPages.aramaKutusu.click();

    }
}
