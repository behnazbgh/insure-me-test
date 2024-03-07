package com.insureme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        //Open browser and navigate to the APP page we want to test
        System.out.println("script executing");
        driver.get("http://18.189.2.242:8081/contact.html");

        //enable wait for 2s
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Locate the components on the page
        driver.findElement(By.id("inputName")).sendKeys("behi");
        Thread.sleep(1000);

        driver.findElement(By.id("inputNumber")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.id("inputMail")).sendKeys("sh@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("inputMessage")).sendKeys("testing");
        Thread.sleep(1000);

        driver.findElement(By.id("my-button")).click();

        driver.quit();
        System.out.println("script executed successfully");
    }
}
