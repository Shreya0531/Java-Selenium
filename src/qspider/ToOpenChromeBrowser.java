package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenChromeBrowser {
    public static void main(String[] args) {
        // Chrome browser----------Chromedriver
        //1. To open the chrome browse

        //defining set property
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        //Create an object for chrome driver, WebDriver interface will give reference to the ChromeDriver
        WebDriver driver = new ChromeDriver();// using dynamic polymorphism concept

        //2. Navigate to the URL
        driver.get("https://www.flipkart.com");// get command is used to navigate to the url.

        //3. To close the browser
        //driver.close();
    }
}
