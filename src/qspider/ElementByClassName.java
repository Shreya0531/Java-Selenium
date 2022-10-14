package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Motorola mobiles");
    }
}
