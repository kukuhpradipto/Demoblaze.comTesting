package page_object.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public static WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        HomePage.webDriver = webDriver;
    }

    @FindBy(id = "cat")
    private WebElement homePage;
    public WebElement getHomePage(){
        return homePage;
    }

    @FindBy(id = "login2")
    private WebElement loginMenu;
    public WebElement getLoginMenu(){
        return loginMenu;
    }


    @FindBy(id = "nameofuser")
    private WebElement accountRegister;
    public WebElement getAccountRegister(){
        return accountRegister;
    }


}
