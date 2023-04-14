package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.List;

public class LocatorsDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //open app
        driver.get("https://automationexercise.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        //Find slider images
//        List<WebElement> sliders= driver.findElements(By.className("girl img-responsive"));
//        System.out.println("Number of sliders: "+ sliders.size());

        //Find  images
        List<WebElement> images= driver.findElements(By.tagName("img"));
        System.out.println("Number of Images: "+ images.size());

        //find total number of links
        List<WebElement> Links= driver.findElements(By.tagName("a"));
        System.out.println("Number of Links: "+ Links.size());


        driver.quit();


    }
}
