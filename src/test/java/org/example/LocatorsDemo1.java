package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //open app
        driver.get("https://automationexercise.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
//        WebElement adClose=driver.findElement(By.xpath("//*[@id='dismiss-button']"));
//        WebElement adClose1=driver.findElement(By.xpath("//*[@id='dismiss-button']/div/svg']"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", adClose,adClose1);
        driver.findElement(By.name("search")).sendKeys("T-shirt");
        driver.findElement(By.id("submit_search")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("View Product")).click();


    }
}