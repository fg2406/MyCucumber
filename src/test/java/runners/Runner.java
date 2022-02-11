package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)  //runner in cucumber ile calismasini saglar bu uyum
    @CucumberOptions(
            features ="src/test/java/resources/features",  //bilgisayarsaki features in yolunu koy
            glue="src/test/java/stepdefinitions",  //yapistirici demek glue,features ile nereyi yapistirayim(calistiracak birlikte),stepdefinitions kismini path aliriz
            tags ="@wig",          //buraya features teki feature icine senario nun ustune yazilian yazilir
            dryRun=true
    )


    public class Runner {



}
