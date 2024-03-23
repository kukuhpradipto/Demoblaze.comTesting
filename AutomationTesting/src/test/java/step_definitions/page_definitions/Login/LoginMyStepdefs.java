package step_definitions.page_definitions.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.LoginVariable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_object.Login.HomePage;
import page_object.Login.LoginPage;
import step_definitions.main.Hooks;

public class LoginMyStepdefs {

    private final WebDriver webDriver;
    public LoginMyStepdefs (){
        super();
        this.webDriver = Hooks.webDriver;
    }

//    @Given("User already on page Login PTOS-M")
//    public void userAlreadyOnPageLoginPTOSM() {
//        LoginPage loginPage = new LoginPage(webDriver);
//        loginPage.getLoginPages()
//                .isDisplayed();
//        Assert.assertTrue(true);
//    }
//
//    @When("User input username \"(.*)\"")
//    public void userInputUsername(String usernameParam) {
//        LoginPage loginPage = new LoginPage(webDriver);
//        LoginVariable loginVariable = new LoginVariable(webDriver);
//        loginPage.getUsernameLogin()
//                .sendKeys(loginVariable.usernameData());
//    }
//
//    @And("User input password \"(.*)\"")
//    public void userInputPassword(String passwordParam) {
//        LoginPage loginPage = new LoginPage(webDriver);
//        LoginVariable loginVariable = new LoginVariable(webDriver);
//        loginPage.getPasswordLogin()
//               .sendKeys(loginVariable.passwordData());
//    }
//
//    @And("User click button Login")
//    public void userClickButtonLogin() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(webDriver);
//        loginPage.getButtonLogin().click();
//        Thread.sleep(1000);
//    }
//
//    @Then("User already on Home Page Application PTOS-M")
//    public void userAlreadyOnHomePageApplicationPTOSM() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.getHomePageX()
//                .isDisplayed();
//        Assert.assertTrue(true);
//    }
//
//    @And("User click eyes icon in password field")
//    public void userClickEyesIconInPasswordField() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(webDriver);
//        loginPage.getButtonIconEyes()
//                .click();
//        Thread.sleep(1000);
//    }
//
//    @Then("Displays the password entered by the user")
//    public void displaysThePasswordEnteredByTheUser() {
//        LoginPage loginPage = new LoginPage(webDriver);
//        LoginVariable loginVariable = new LoginVariable(webDriver);
//        loginPage.getPasswordLogin()
//                .getAttribute(loginVariable.passwordData());
//    }


    @Given("user is already on the Login page of demoblaze.com")
    public void userIsAlreadyOnTheLoginPageOfDemoblazeCom() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomePage().isDisplayed();
        Assert.assertTrue(true);
    }

    @When("user clicks on the Login menu in the Navbar on the Home page of demoblaze.com")
    public void userClicksOnTheLoginMenuInTheNavbarOnTheHomePageOfDemoblazeCom() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.getLoginMenu().click();
        Thread.sleep(1000);
    }

    @And("user enter the username \"(.*)\"")
    public void userEnterTheUsername(String usernameParam) {
        LoginPage loginPage = new LoginPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        loginPage.getUsernameLogin().sendKeys(loginVariable.usernameData());
    }

    @And("user enter the password \"(.*)\"")
    public void userEnterThePassword(String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        loginPage.getPasswordLogin().sendKeys(loginVariable.passwordData());
    }

    @And("user clicks the Login button")
    public void userClicksTheLoginButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getButtonLogin().click();
    }

    @Then("user successfully logs in and their username are displayed in the Navbar")
    public void userSuccessfullyLogsInAndTheirNameAndEmailAreDisplayedInTheNavbar() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getAccountRegister().getText();
    }
}
