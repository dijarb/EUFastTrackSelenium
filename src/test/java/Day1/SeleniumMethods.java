package Day1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class SeleniumMethods {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.ebay.com");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        driver.navigate().refresh();
        System.out.println(driver.getTitle());
    }
}
