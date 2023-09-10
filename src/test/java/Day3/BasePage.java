package Day3;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver = Driver.get();
        PageFactory.initElements(driver,this);
    }

}
