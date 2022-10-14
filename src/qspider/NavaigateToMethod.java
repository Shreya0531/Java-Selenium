package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavaigateToMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.instagram.com");
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        driver.close();
    }
}
