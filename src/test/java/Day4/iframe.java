package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;

public class iframe extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    // get frame by web element
    @Test
    public void test1() throws InterruptedException {
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("tinymce")).getTagName());

    }

    // get frame by index number
    @Test
    public void test2(){
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.id("tinymce")).getTagName());

    }

    // get frame by name / id
    @Test
    public void test3(){
        driver.switchTo().frame("mce_0_ifr");
        System.out.println(driver.findElement(By.id("tinymce")).getTagName());


    }
}