package Day3;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Dropdowns extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void test1(){
        WebElement firstDrop = driver.findElement(By.id("dropdown"));
        Select select = new Select(firstDrop);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        WebElement yearDrop = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDrop);
        yearSelect.selectByValue("2017");

        WebElement stateDrop = driver.findElement(By.id("state"));
        Select stateSelect = new Select(stateDrop);
        stateSelect.selectByVisibleText("Arizona");

        WebElement langDrop = driver.findElement(By.cssSelector("select[name='Languages']"));
        Select langSelect = new Select(langDrop);
        for (int i = 0; i < langSelect.getOptions().size(); i++) {
            langSelect.selectByIndex(i);
        }
        for (WebElement selectedoption : langSelect.getAllSelectedOptions()) {
            System.out.println(selectedoption.getText());
        }
    }

}
