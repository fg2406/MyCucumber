package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {     //steplerin ici ne kadar sade ve bos olursa okunakli olur,her feature icin stepdef.class lazim


    @Given("Amazon sitesine git")
    public void amazon_sitesine_git() {
        System.out.println("Amazon sitesine girildi ");
    }


    @Given("login butonuna tikla")
    public void login_butonuna_tikla() {
        System.out.println("login butonu tiklandi");
    }


    @Given("isim gir")
    public void isim_gir() {
        System.out.println("isi girildi");
    }

    @Given("sifre gir")
    public void sifre_gir() {
        System.out.println("sifre girildi");
    }


    @When("submit butonuna tikladigimda")
    public void submit_butonuna_tikladigimda() {
        System.out.println("submit butonuna tiklandi");
    }



    @Then("success mesajini verify et")
    public void success_mesajini_verify_et() {
        System.out.println("success mesaji basari ile kayit oldu");
    }


    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder")
    public void acilanSayfadaENTERACCOUNTINFORMATIONYazisinnGorunurOldugunuTestEder() {

    }
}
