package page_object.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public static WebDriver webDriver;
    public RegisterPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//a[.='Sign up']")
    private WebElement subMenuRegister;
    public WebElement getSubMenuRegister(){
        return subMenuRegister;
    }

    @FindBy(id = "sign-username")
    private WebElement userNameRegister;
    public WebElement getUserNameRegister(){
        return userNameRegister;
    }

    @FindBy(id = "sign-password")
    private WebElement passwordRegister;
    public WebElement getPasswordRegister(){
        return passwordRegister;
    }

    @FindBy(xpath = "//button[.='Sign up']")
    private WebElement buttonSignIn;
    public WebElement getButtonSignIn(){
        return buttonSignIn;
    }


}
