package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Testing");
        WebElement element = driver.findElement(By.name("q"));
        System.out.println(element);
        element.clear();
        System.out.println(element);
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.google.com");
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();
    }
}
