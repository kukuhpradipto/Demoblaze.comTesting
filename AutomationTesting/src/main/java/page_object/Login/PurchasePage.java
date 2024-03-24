package page_object.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Fi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {

    public static WebDriver webDriver;
    public PurchasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//a[.='Phones']")
    private WebElement phoneCatagories;
    public WebElement getPhoneCatagories(){
        return phoneCatagories;
    }

    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    private WebElement phoneProduct;
    public WebElement getPhoneProduct(){
        return phoneProduct;
    }

    @FindBy(xpath = "//a[.='Add to cart']")
    private WebElement addCartButton;
    public WebElement getAddCartButton(){
        return addCartButton;
    }

    @FindBy(xpath = "//a[@id='cartur']")
    private WebElement cartSubmenu;
    public WebElement getCartSubmenu(){
        return cartSubmenu;
    }

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement placeOrderButton;
    public WebElement getPlaceOrderButton(){
        return placeOrderButton;
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namePlaceForm;
    public WebElement getNamePlaceForm(){
        return namePlaceForm;
    }

    @FindBy(xpath = "//input[@id='country']")
    private WebElement countryPlaceForm;
    public WebElement getCountryPlaceForm(){
        return countryPlaceForm;
    }


    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityPlaceForm;
    public WebElement getCityPlaceForm(){
        return cityPlaceForm;
    }


    @FindBy(xpath = "//input[@id='card']")
    private WebElement cardPlaceForm;
    public WebElement getCardPlaceForm(){
        return cardPlaceForm;
    }


    @FindBy(xpath = "//input[@id='month']")
    private WebElement monthPlaceForm;
    public WebElement getMonthPlaceForm(){
        return monthPlaceForm;
    }


    @FindBy(xpath = "//input[@id='year']")
    private WebElement yearPlaceForm;
    public WebElement getYearPlaceForm(){
        return yearPlaceForm;
    }


    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement purchaseButtonPlaceForm;
    public WebElement getPurchaseButtonPlaceForm(){
        return purchaseButtonPlaceForm;
    }

    @FindBy(xpath = "//h5[@id='orderModalLabel']")
    private WebElement placeOrderPage;
    public WebElement getPlaceOrderPage(){
        return placeOrderPage;
    }

    @FindBy(xpath = "//button[.='Purchase']")
    private WebElement purchaseButtonSubmit;
    public WebElement getPurchaseButtonSubmit(){
        return purchaseButtonSubmit;
    }


    @FindBy(xpath = "//h2[.='Thank you for your purchase!']")
    private WebElement successSubmit;
    public WebElement getSuccessSubmit(){
        return successSubmit;
    }

}
