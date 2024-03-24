package step_definitions.page_definitions.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.PurchaseVariable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_object.Login.PurchasePage;
import step_definitions.main.Hooks;

public class PurchaseMyStepdefss {

    private final WebDriver webDriver;
    public PurchaseMyStepdefss(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("user select to phone categories")
    public void userSelectToPhoneCategories() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getPhoneCatagories().click();
        Thread.sleep(2000);
    }

    @And("user select phone product")
    public void userSelectPhoneProduct() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getPhoneProduct().click();
        Thread.sleep(2000);
    }

    @And("user click Add to Cart button")
    public void userClickAddToCartButton() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getAddCartButton().click();
        Thread.sleep(2000);
        webDriver.switchTo().alert().accept();
        Thread.sleep(1000);
    }

    @And("user click Cart submenu")
    public void userClickCartSubmenu() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getCartSubmenu().click();
        Thread.sleep(1000);
    }

    @And("user click button place order")
    public void userClickButtonPlaceOrder() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getPurchaseButtonPlaceForm().click();
        Thread.sleep(1000);
    }

    @Given("user already to Form Place Order")
    public void userAlreadyToFormPlaceOrder() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getPlaceOrderPage().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @When("user input Name field \"(.*)\"")
    public void userInputNameField(String arg0) throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        PurchaseVariable variable = new PurchaseVariable(webDriver);
        purchasePage.getNamePlaceForm().sendKeys(variable.namePlaceOrder());
        Thread.sleep(1000);
    }

    @And("user input Country field \"(.*)\"")
    public void userInputCountryField(String arg0) throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        PurchaseVariable variable = new PurchaseVariable(webDriver);
        purchasePage.getCountryPlaceForm().sendKeys(variable.countryPlaceOrder());
        Thread.sleep(1000);
    }

    @And("user input City field \"(.*)\"")
    public void userInputCityField(String arg0) throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        PurchaseVariable variable = new PurchaseVariable(webDriver);
        purchasePage.getCityPlaceForm().sendKeys(variable.cityPlaceOrder());
        Thread.sleep(1000);
    }

    @And("user input Credit Card  field \"(.*)\"")
    public void userInputCreditCardField(String arg0) throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        PurchaseVariable variable = new PurchaseVariable(webDriver);
        purchasePage.getCardPlaceForm().sendKeys(variable.cardPlaceOrder());
        Thread.sleep(1000);

    }

    @And("user input Month field \"(.*)\"")
    public void userInputMonthField(String arg0) throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        PurchaseVariable variable = new PurchaseVariable(webDriver);
        purchasePage.getMonthPlaceForm().sendKeys(variable.monthPlaceOrder());
        Thread.sleep(1000);
    }

    @And("user input Year field \"(.*)\"")
    public void userInputYearField(String arg0) throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        PurchaseVariable variable = new PurchaseVariable(webDriver);
        purchasePage.getYearPlaceForm().sendKeys(variable.yearPlaceOrder());
        Thread.sleep(1000);
    }

    @Then("user click Purchase button")
    public void userClickPurchaseButton() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getPurchaseButtonSubmit().click();
        Thread.sleep(1000);
    }

    @And("user success submit display information total amount")
    public void userSuccessDisplayInformastionTotalAmount() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        purchasePage.getSuccessSubmit().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);

    }

}
