package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public static void main(String[] args) throws InterruptedException {


        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions options = new ChromeOptions();
        //headless mode
//        options.addArguments("--headless=new");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
//        WebDriver driver1=new FirefoxDriver();

// Launch website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
//        driver1.get("https://opensource-demo.orangehrmlive.com/");
        //Send username
//        WebElement txtUsername= driver.findElement(By.name("username"));
//        txtUsername.sendKeys("Admin");
        //enter username and pasword
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        //Verify title
       /*
        String act_title=driver.getTitle();
        String exp_title="OrangeHRM";
        if(act_title.equals(exp_title)){
            System.out.println("Title is same");
        }
        else {
            System.out.println("Title not same");
        }
        */

        //label Validation
        String act_label="";
        try {
            act_label= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        }
        catch (NoSuchElementException e){
//           act_label="";

        }

       String exp_label="Dashboard";
       if(act_label.equals(exp_label)){
           System.out.println("Label same");
       }
       else {
           System.out.println("label not same");
       }

        //Close browser
        driver.quit();

    }
}
