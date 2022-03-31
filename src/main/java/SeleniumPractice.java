import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {


        //WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.safaridriver().setup();

        WebDriver driver = new ChromeDriver();



        driver.get("https://filip-frontend.herokuapp.com/");


        System.out.println(driver.getTitle());



        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5 * 1000);




        WebElement userName = driver.findElement(By.name("fname"));

        WebElement playButton = driver.findElement(By.className("againBut"));

        WebElement jumpAction = driver.findElement(By.id("ninja"));

        String textValue = playButton.getText();



        userName.sendKeys("Filip");
        playButton.click();
        Thread.sleep(700);
        jumpAction.click();



        System.out.println(textValue);
        Thread.sleep(5 * 1000);


        driver.quit();






    }
}
