package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;

import java.util.*;

public class Hover extends BasePage {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> hovers = driver.findElements(By.className("figure"));
        for (WebElement hover : hovers) {
            actions.moveToElement(hover).perform();
            Thread.sleep(1000);
        }
    }

}
