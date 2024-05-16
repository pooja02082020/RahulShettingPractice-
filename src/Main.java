import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome,driver","");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        //Using Basic options just by id selector
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
    }
}