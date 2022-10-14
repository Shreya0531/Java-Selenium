package qspider;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scroll {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js= (JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0,3000)");

        Thread.sleep(9000);
        //js.executeScript("window.scrollBy(0,3000)");
    }
}
