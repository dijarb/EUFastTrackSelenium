package Day3;

import org.junit.*;
import org.openqa.selenium.*;

public class Alerts extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
    }
    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();
        alert.accept();
    }

    @Test
    public void test3() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.sendKeys("I have sent message");
        alert.accept();
    }
}
