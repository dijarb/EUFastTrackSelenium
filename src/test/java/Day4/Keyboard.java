package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;

public class Keyboard extends BasePage {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/key_presses");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        Thread.sleep(500);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/");
        Actions actions = new Actions(driver);
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(500);
        }

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            Thread.sleep(500);
        }
    }
}