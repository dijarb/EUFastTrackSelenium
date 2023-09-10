package Day3;

import org.junit.*;
import org.openqa.selenium.*;

import java.util.*;

public class RadioBtn extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @Test
    public void test1(){
        WebElement radbtn1 = driver.findElement(By.id("red"));
        radbtn1.click();
        System.out.println(radbtn1.getText());
    }

    @Test
    public void test2() throws InterruptedException {
        List<WebElement> allButtons = driver.findElements(By.cssSelector(".radio input"));
        for (WebElement allButton : allButtons) {
            System.out.println("Clicking "+allButton.getAttribute("id"));
            Thread.sleep(1000);
            allButton.click();
        }
    }
}
