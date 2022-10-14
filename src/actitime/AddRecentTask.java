package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRecentTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        Thread.sleep(5000);
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("loginButtonContainer")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/span[@class='arrow']")).click();
        driver.findElement(By.xpath("//div/span/span/span[text()='Meetings']")).click();
        //driver.close();
    }
}
