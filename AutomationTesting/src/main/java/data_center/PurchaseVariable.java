package data_center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class PurchaseVariable {
    public static WebDriver webDriver;
    public PurchaseVariable(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        PurchaseVariable.webDriver = webDriver;
    }


    public String namePlaceOrder(){
        return "Kukuh Pradipto";
    }

    public String countryPlaceOrder(){
        return "Indonesia";
    }

    public String cityPlaceOrder(){
        return "Kendal";
    }

    public String cardPlaceOrder(){
        return "33245601011";
    }

    public String monthPlaceOrder(){
        return "Juli";
    }

    public String yearPlaceOrder(){
        return "2023";
    }

}
