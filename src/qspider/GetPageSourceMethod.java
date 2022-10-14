package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String pageSource = driver.getPageSource();
        System.out.println("The page source is : "+pageSource);
        driver.close();
    }
}
