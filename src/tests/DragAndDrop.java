package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");

        WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
        WebElement block2 = driver.findElement(By.xpath("//h1[text() = 'Block 2']"));

        Thread.sleep(4000);
        Actions a = new Actions(driver);
        a.dragAndDrop(block3,block2).perform();
    }
}
