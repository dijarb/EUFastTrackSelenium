package utilities;


import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.safari.*;

import java.util.concurrent.*;

public class Driver {

    private Driver() {}

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null) {
            String browser = ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
            maximizeWindow();
            timeout(10,"s");

        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void timeout(long duration, String unitOfTime) {
        switch (unitOfTime.toLowerCase()) {
            case "ms":
                driver.manage().timeouts().implicitlyWait(duration, TimeUnit.MILLISECONDS);
                break;
            case "s":
                driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
                break;
            case "m":
                driver.manage().timeouts().implicitlyWait(duration, TimeUnit.MINUTES);
                break;
            case "h":
                driver.manage().timeouts().implicitlyWait(duration, TimeUnit.HOURS);
                break;
            case "d":
                driver.manage().timeouts().implicitlyWait(duration, TimeUnit.DAYS);
                break;
        }
        return;
    }
    public static void maximizeWindow(){
        driver.manage().window().maximize();
        return;
    }
}