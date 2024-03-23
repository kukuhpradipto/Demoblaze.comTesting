package page_object.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver webDriver;
    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement usernameLogin;
    public WebElement getUsernameLogin(){
        return usernameLogin;
    }

    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement passwordLogin;
    public WebElement getPasswordLogin(){
        return passwordLogin;
    }

    @FindBy(xpath = "//button[.='Log in']")
    private WebElement buttonLogin;
    public WebElement getButtonLogin(){
        return buttonLogin;
    }

}
