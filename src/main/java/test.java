

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Dropdown")).click();

            WebElement dropdown = driver.findElement(By.id("dropdown"));



            Select s = new Select(dropdown);
            s.selectByVisibleText("Option 1");

            System.out.println("dropdown selected succesfully");


            driver.quit();
        }
    }


