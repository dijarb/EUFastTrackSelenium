package Day2;

import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class Practice {

    WebDriver driver;

    @Before
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        driver.get("https://www.google.com/");
        WebElement gLink = driver.findElement(By.linkText("Gmail"));
        WebElement gPLink = driver.findElement(By.partialLinkText("Gm"));
        System.out.println(gPLink.getText());
        System.out.println(gLink.getText());
    }

    @Test
    public void test2(){
        driver.get("https://www.google.com/");
        WebElement textCss = driver.findElement(By.cssSelector(".gLFyf"));
        WebElement textXpath = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        System.out.println(textXpath.getTagName());
        System.out.println(textCss.getTagName());
    }
    @Test
    public void test3(){
        driver.get("https://www.w3schools.com");
        WebElement headCss = driver.findElement(By.cssSelector("h1.learntocodeh1"));
        WebElement headXpath = driver.findElement(By.xpath("//*[@class=\"learntocodeh1\"]"));
        System.out.println(headCss.getTagName());
        System.out.println(headXpath.getTagName());
    }

    @Test
    public void test4(){
        driver.get("https://www.w3schools.com");
        WebElement search = driver.findElement(By.id("search2"));
        System.out.println(search.getTagName());
    }

    @Test
    public void test5() {
        driver.get("https://www.ebay.com/globaldeals");
        List<WebElement> names = driver.findElements(By.xpath("//span[@itemprop=\"name\"]"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[@itemprop=\"price\"]"));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).getText());
            System.out.println(prices.get(i).getText());
            System.out.println();

        }
    }
}
