package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment1 {
    @Test
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        // Launch website
        driver.get("https://admin-demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement txt_name=driver.findElement(By.name("Email"));
        txt_name.clear();
        txt_name.sendKeys("admin@yourstore.com");
        WebElement txt_password=driver.findElement(By.name("Password"));
        txt_password.clear();
        txt_password.sendKeys("admin");

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

        //Label validation
        String actLabel="";
        try {
            actLabel = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
        }
        catch (NoSuchElementException e){

        }
        String expLabel="Dashboard";

        if(actLabel.equals(expLabel)){
            System.out.println("same label,Test Passed");
        }
        else{
            System.out.println("label not same, test failed");
        }
    }

}
