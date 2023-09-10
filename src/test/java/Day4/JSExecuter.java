package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;

public class JSExecuter extends BasePage {


    //click
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement link = driver.findElement(By.xpath("//a[@href=\"/dropdown\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", link);
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String text = "Hello Disabled Input";

        jse.executeScript("arguments[0].setAttribute('value', '" + text +"')", inputBox);
    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,250)");

        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,-250)");

        }


    }

}