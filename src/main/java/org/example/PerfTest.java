package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PerfTest {
    @Test
    public void testSubmit() throws MalformedURLException, InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions options = new ChromeOptions();
        //headless mode
//        options.addArguments("headless");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
//        WebDriver driver1=new FirefoxDriver();

// Launch website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
//        driver1.get("https://opensource-demo.orangehrmlive.com/");
        //Send username
//        WebElement txtUsername= driver.findElement(By.name("username"));
//        txtUsername.sendKeys("Admin");
        //enter username and pasword
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }
}
