package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //open app
        driver.get("https://admin-demo.nopcommerce.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();


    }
}
