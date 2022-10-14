package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//selenium jars and drivers//chrome driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers");
        driver.manage().window().maximize();

        String selfnode = driver.findElement(By.xpath("//a[contains(text(),'Chandni Machines')]/self::a")).getText();
        System.out.println(selfnode);

        String parentnode = driver.findElement(By.xpath("//a[contains(text(),'Chandni Machines')]/parent::td")).getText();
        System.out.println("The parent node is : "+parentnode);

        List<WebElement> childnode = driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/child::*"));
        System.out.println("The no of child nodes: "+
                childnode.size()
        );

        String ancestornode = driver.findElement(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr")).getText();
        System.out.println("The ancestor node is : "+ancestornode);

        List<WebElement> followingnode = driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/following::*"));
        System.out.println("The no of following elements from the currentt HTML tag is " +followingnode.size());

        List<WebElement> folloiwngSibling = driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/following-sibling::*"));
        System.out.println("The no of following siblings " +folloiwngSibling.size());

        List<WebElement> precedingnodes = driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/preceding::*"));
        System.out.println("The no of preceding nodes are :"+ precedingnodes.size());

        List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("The no of preceding siblings : "+precedingSibling.size());

        driver.close();
    }
}
