package Day3;

import org.junit.*;
import org.openqa.selenium.*;

public class Frames extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
    }

    @Test
    public void test1(){
        System.out.println(driver.getCurrentUrl());
        WebElement frametop = driver.findElement(By.name("frame-top"));
        driver.switchTo().frame(frametop);
        WebElement frame = driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(frame);
        System.out.println(driver.findElement(By.id("content")).getText());

    }

}
