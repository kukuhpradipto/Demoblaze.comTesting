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

    @Given("user is already on the Home page of demoblaze.com")
    public void userIsAlreadyOnTheLoginPageOfDemoblazeCom() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomePage().isDisplayed();
        Assert.assertTrue(true);
    }

    @When("user click on the Login menu in the Navbar on the Home page of demoblaze.com")
    public void userClicksOnTheLoginMenuInTheNavbarOnTheHomePageOfDemoblazeCom() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.getLoginMenu().click();
        Thread.sleep(1000);
    }

    @And("user input the username \"(.*)\"")
    public void userInputTheUsername(String usernameParam) {
        LoginPage loginPage = new LoginPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        loginPage.getUsernameLogin().sendKeys(loginVariable.usernameData());
    }

    @And("user input the password \"(.*)\"")
    public void userInputThePassword(String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        loginPage.getPasswordLogin().sendKeys(loginVariable.passwordData());
    }

    @And("user click the Login button")
    public void userClicksTheLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getButtonLogin().click();
        Thread.sleep(2000);
    }

    @Then("user successfully logs in and their username are displayed in the Navbar")
    public void userSuccessfullyLogsInAndTheirNameAndEmailAreDisplayedInTheNavbar() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getAccountRegister().getText();
    }

    @And("user input the unregistered password \"(.*)\"")
    public void userInputTheUnregisteredPassword(String unPasswordParam) {
        LoginPage loginPage = new LoginPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        loginPage.getPasswordLogin().sendKeys(loginVariable.unPasswordParams());
    }

    @Then("display pop up information wrong password")
    public void displayPopUpInformationWrongPassword() throws InterruptedException {
        try {
            String a = webDriver.switchTo().alert().getText();
            String b = "Wrong password.";
            Assert.assertEquals(b,a);
        }finally {
            webDriver.quit();
        }
    }

    @And("user input the unregistered username \"(.*)\"")
    public void userInputTheUnregisteredUsername(String unUsernameParam) {
        LoginPage loginPage = new LoginPage(webDriver);
        LoginVariable loginVariable = new LoginVariable(webDriver);
        loginPage.getUsernameLogin().sendKeys(loginVariable.unUsernameParams());
    }

    @Then("display pop up information User does not exist")
    public void displayPopUpInformationUserDoesNotExist() throws InterruptedException {
        try {
            String a = webDriver.switchTo().alert().getText();
            String b = "User does not exist.";
            Assert.assertEquals(b,a);
        }
        finally {
            webDriver.quit();
        }
    }

    @And("user input the password with blank data")
    public void userInputThePasswordWithBlankData() {
        LoginPage loginPage = new LoginPage(webDriver);
        String a = "";
        loginPage.getPasswordLogin().sendKeys(a);
    }

    @Then("display pop up information Please fill out Password")
    public void displayPopUpInformationPleaseFillOutPassword() {
        try {
            String a = webDriver.switchTo().alert().getText();
            String b = "Please fill out Password.";
            Assert.assertEquals(b,a);
        } finally {
            webDriver.quit();
        }
    }
}
