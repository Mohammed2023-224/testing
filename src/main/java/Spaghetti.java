import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Spaghetti {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        /*  Waits
        -- implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        -- Explicit wait object
        Wait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        -- fluent wait object
        Wait wait=new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2)).withMessage("testing")..pollingEvery(Duration.ofSeconds(2));
        */

        driver.navigate().to("https://www.google.com");

        By search = By.xpath("//textarea[@title='بحث']");
     /*
       -- xpath
      --- id - className - name - link text -partial link text - xpath - css selector
      driver.findElement(By.id(""))
      driver.findElement(By.linkText("About Us"));   // Works with  tag a
    */

        By searchButton = test(1);
        driver.findElement(search).sendKeys("test");
        driver.findElement(searchButton).click();

//        driver.close();
    }

     static By test(int index){
        return By.xpath("(//input[@class='gNO89b'])["+index+"]");
    }
}
