package step_definitions.page_definitions.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.LoginVariable;
import data_center.RegisterVariable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_object.Login.RegisterPage;
import step_definitions.main.Hooks;

public class RegisterMyStepdefs {

    private final WebDriver webDriver;
    public RegisterMyStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("user click on the Register menu in the Navbar on the Home page of demoblaze.com")
    public void userClickOnTheRegisterMenuInTheNavbarOnTheHomePageOfDemoblazeCom() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.getSubMenuRegister().click();
        Thread.sleep(1000);
    }

    @And("user input register with unregistered username\"(.*)\"")
    public void userInputTheUnregisteredUsername(String unUsernameParam) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        RegisterVariable registerVariable = new RegisterVariable(webDriver);
        registerPage.getUserNameRegister().sendKeys(registerVariable.unUsernameParams());
        Thread.sleep(1000);
    }

    @And("user click the Register button")
    public void userClickTheRegisterButton() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.getButtonSignIn().click();
        Thread.sleep(1000);
    }

    @Then("user successfully register and display pop up Sign up successful.")
    public void userSuccessfullyRegisterAndDisplayPopUpSignUpSuccessful() {
        try {
            String a = webDriver.switchTo().alert().getText();
            String b = "Sign up successful.";
            Assert.assertEquals(b,a);
        } finally {
            webDriver.quit();
        }
    }

    @And("user input register with unregistered password \"(.*)\"")
    public void userInputRegisterWithUnregisteredPassword(String unPasswordParam){
        RegisterPage registerPage = new RegisterPage(webDriver);
        RegisterVariable registerVariable = new RegisterVariable(webDriver);
        registerPage.getPasswordRegister().sendKeys(registerVariable.unPasswordParams());
    }

    @And("user input the registered username\"(.*)\"")
    public void userInputTheRegisteredUsername(String usernameParam) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        registerPage.getUserNameRegister().sendKeys(loginVariable.usernameData());

    }

    @And("user input the registered password \"(.*)\"")
    public void userInputTheRegisteredPassword(String passwordParam) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        registerPage.getPasswordRegister().sendKeys(loginVariable.passwordData());
    }

    @Then("user can't register and display pop up This user already exist.")
    public void userCanTRegisterAndDisplayPopUpThisUserAlreadyExist() {
        try {
            String a = webDriver.switchTo().alert().getText();
            String b = "This user already exist.";
        } finally {
            webDriver.quit();
        }
    }
}
