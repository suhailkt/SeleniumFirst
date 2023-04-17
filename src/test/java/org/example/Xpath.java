package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //open app
        driver.get("https://demo.opencart.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

       String productName= driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
       System.out.println(productName);


    }
}
