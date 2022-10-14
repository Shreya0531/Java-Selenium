package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        String url = "https://facebook.com";
        driver.get(url);
        System.out.println("url is : "+url);

        driver.close();
        driver.quit();
    }
}
