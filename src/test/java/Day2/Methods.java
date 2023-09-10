package Day2;

import org.junit.*;
import org.openqa.selenium.*;
import utilities.*;

public class Methods {

    @Test
    public void clickMethod(){
        Driver.get().get("http://practice.cybertekschool.com/");
        WebElement firstClick = Driver.get().findElement(By.xpath("//a[@href='/abtest']"));
        firstClick.click();
        System.out.println(Driver.get().getCurrentUrl());
    }

    @Test
    public void clickCheckBox(){
        Driver.get().get("http://practice.cybertekschool.com/checkboxes");
        Driver.get().findElement(By.xpath("//input[@id='box1']")).click();

    }

    @Test
    public void sendKeys(){
        Driver.get().get("https://www.google.com");
        WebElement searchBar = Driver.get().findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
        searchBar.sendKeys("bike");
        searchBar.sendKeys(Keys.ENTER);

        Assert.assertEquals(searchBar.getText(),"blbalba");
    }
}
