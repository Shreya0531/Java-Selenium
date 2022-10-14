import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.name("email")).sendKeys("8618518485");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("shreyakrishna0703@");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        driver.close();


    }
}
