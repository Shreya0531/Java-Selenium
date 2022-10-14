package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current url is : "+currentUrl);
        driver.close();
    }
}
