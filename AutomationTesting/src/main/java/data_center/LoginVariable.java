package data_center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginVariable {
    public static WebDriver webDriver;
    public LoginVariable(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        LoginVariable.webDriver = webDriver;
    }

    public String usernameData(){
        return  "kukuhpradipto98@gmail.com";
    }

    public String passwordData(){
        return "Kukuh04021998";
    }

}
