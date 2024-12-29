import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class Spaghetti {

    public static void main(String[] args){
        EdgeOptions options=new EdgeOptions();
//        options.addArguments("--headless");
        options.addArguments("--start-maximized");
        WebDriver driver= new EdgeDriver(options);
        driver.get("https://www.google.com");
        By search=By.xpath("//textarea[@title='بحث']");

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
