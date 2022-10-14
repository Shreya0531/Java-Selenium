package TV;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class Wiki {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js= (JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0,700)");
        String releaseDate = driver.findElement(By.className("infobox-data")).getText();

        if(releaseDate=="17 December 2021")
        {
            System.out.println("Test passes successfully");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}
