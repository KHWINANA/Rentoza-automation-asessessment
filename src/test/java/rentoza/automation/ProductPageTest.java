package rentoza.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPageTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.get("https://rentoza.co.za/");

        driver.manage().window().maximize();

        WebElement products = driver.findElement(By.cssSelector(".px-0.nav-link.dropdown-menu-item[href='/collections/new-arrivals']"));
        products.click();

        WebElement title = driver.findElement(By.cssSelector("a[title='iPhone 16 PRO 128GB']"));
        System.out.println("Title: " + title.getText());
    }
}

