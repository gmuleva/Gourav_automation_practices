import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // Click on “Checkboxes” link
        driver.findElement(By.linkText("Checkboxes")).click();

        // Correct XPaths
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        // Select checkbox 1 (if not selected)
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        // Unselect checkbox 2 (if selected)
        if (checkbox2.isSelected()) {
            checkbox2.click();
        }

        System.out.println("Checkbox actions completed!");
    }
}

