package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //open app
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        //Title validation
        String act_title = driver.getTitle();
        String exp_title = "nopCommerce demo store";
        if (act_title.equals(exp_title)) {
            System.out.println("Title is same");
        } else {
            System.out.println("Title not same");

        }

        //tag, id
//        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");

        //tag,class
//        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac");

        //tag, attribute
//        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Mac");

        //tag,class,attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mac");
    }
}
