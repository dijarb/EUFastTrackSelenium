package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;

public class Upload extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/upload");
    }
    @Test
    public void test1(){
        WebElement uploadLink = driver.findElement(By.id("file-upload"));
        uploadLink.sendKeys("C:\\Users\\dijar\\Desktop\\New Text Document.txt");
        driver.findElement(By.id("file-submit")).click();
    }
}
