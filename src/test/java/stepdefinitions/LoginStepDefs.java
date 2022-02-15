package stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.LoginPage;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();


    @FindBy(partialLinkText = "Signup")
    public WebElement signupButton;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;
    @FindBy(name= "name")
    public WebElement nameBox;
    @FindBy (xpath = "(//*[@name=\"email\"])[2]")
    public WebElement emailBox;
    @FindBy(xpath = "(//*[@type= 'submit'])[2]")
    public WebElement accountCreatSignupButton;
    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;




}
