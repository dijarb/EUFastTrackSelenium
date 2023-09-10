package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;

public class DragDrop extends BasePage {


    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        WebElement a = driver.findElement(By.id("column-a"));
        WebElement b = driver.findElement(By.id("column-b"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(a,b).perform();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/drag_and_drop_circles");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.dragAndDrop(source, target).perform();
    }
}