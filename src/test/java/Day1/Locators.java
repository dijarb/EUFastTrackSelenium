package Day1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

//        WebElement flash = driver.findElement(By.id("flash-messages"));
//        System.out.println(flash.getTagName());
//
//        WebElement name = driver.findElement(By.name("viewport"));
//        System.out.println(name.getTagName());
//
//        WebElement className = driver.findElement(By.className("h1y"));
//        System.out.println(className.getTagName());
//
//        WebElement listGroupItem =  driver.findElement(By.className("list-group-item"));
//        System.out.println(listGroupItem.getTagName());
//
//        List<WebElement> listGroupItems = driver.findElements(By.className("list-group-item"));
//        System.out.println(listGroupItems.size());

//        WebElement tagName = driver.findElement(By.tagName("h1"));
//        System.out.println(tagName.getTagName());

//        WebElement linkText = driver.findElement(By.linkText("Home"));
//        System.out.println(linkText.getTagName());
//        System.out.println(linkText.getText());
//
//        WebElement partialLinkText = driver.findElement(By.partialLinkText("me"));
//        System.out.println(partialLinkText.getTagName());
//        System.out.println(partialLinkText.getText());

//        WebElement flash = driver.findElement(By.cssSelector("ul.list-group li a[href='/autocomplete']"));
//        System.out.println(flash.getText());

//        WebElement stateArkan = driver.findElement(By.cssSelector("select#state option:nth-of-type(5)"));
//        System.out.println(stateArkan.getText());

        List<WebElement> states = driver.findElements(By.cssSelector("select#state option"));
        for (WebElement state: states) {
            System.out.println(state.getText());
        }




    }
}
