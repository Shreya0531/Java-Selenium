package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisplayActitimePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/ ");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(5000);
        driver.close();


    }
}
