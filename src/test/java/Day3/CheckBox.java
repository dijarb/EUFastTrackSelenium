package Day3;

import org.junit.*;
import org.openqa.selenium.*;

public class CheckBox extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/checkboxes");
    }

    @Test
    public void test1(){
        WebElement box1 = driver.findElement(By.id("box1"));
        box1.click();
        WebElement box2 = driver.findElement(By.id("box2"));
        box2.click();
    }
}
