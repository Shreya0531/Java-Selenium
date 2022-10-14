package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementById {
    public static void main(String[] args) {
        // Chrome browser----------Chromedriver
        //1. To open the chrome browse

        //defining set property
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        //Create an object for chrome driver, WebDriver interface will give reference to the ChromeDriver
        WebDriver driver = new ChromeDriver();// using dynamic polymorphism concept

        //2. To maximize the browser
        driver.manage().window().maximize();

        //3. Navigate to the URL
        driver.get("http://automationpractice.com/index.php");// get command is used to navigate to the url.

        //By ID
        driver.findElement(By.id("search_query_top")).sendKeys("Skirts");

        //By Name
        //driver.findElement(By.name("search_query")).sendKeys("Skirts");



        //To close the browser
        //driver.close();
    }
}
