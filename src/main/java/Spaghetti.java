import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Spaghetti {

    public static void main(String[] args){
        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
//        Wait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
//        Wait wait=new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2)).withMessage("testing")..pollingEvery(Duration.ofSeconds(2));

        driver.navigate().to("https://www.google.com");
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        By search=By.xpath("//textarea[@title='بحث']");
        /* id - name - link text -partial link text - xpath - css selector
        */

//        wait.until(ExpectedConditions.visibilityOfElementLocated(search));   //explicit wait


        By searchButton=test(1);
        driver.findElement(search).sendKeys("test");
        driver.findElement(searchButton).click();

//        driver.close();
    }
// Xpath + wait + enter

     static By test(int index){
        return By.xpath("(//input[@class='gNO89b'])["+index+"]");
    }
}
