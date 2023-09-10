package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;

public class Frames extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
    }


    @Test
    public void test1() throws InterruptedException {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("#content")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.name("frame-top")).getAttribute("src"));
    }


}