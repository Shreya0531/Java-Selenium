package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("username")).sendKeys("sdfgh");
        driver.findElement(By.name("password")).sendKeys("sdfgh");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
    }
}
