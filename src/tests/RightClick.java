package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");

        WebElement searchTab = driver.findElement(By.id("twotabsearchtextbox"));
        //WebElement block2 = driver.findElement(By.xpath("//h1[text() = 'Block 2']"));

        Thread.sleep(4000);
        Actions a = new Actions(driver);
        a.contextClick(searchTab).perform();
    }
}
