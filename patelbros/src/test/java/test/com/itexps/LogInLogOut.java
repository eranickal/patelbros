/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Owner
 */
public class LogInLogOut {

    private WebDriver driver;
    private String baseUrl;

    public LogInLogOut() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

//    @Test
//    public void testPatel() throws Exception {
//        driver.get(baseUrl + "chrome://newtab/");
//        driver.get("https://shop.patelbros.com/login");
//
//        driver.findElement(By.name("email")).sendKeys("riyap3231@gmail.com");
//                driver.findElement(By.name("password")).clear();
//        driver.findElement(By.name("password")).sendKeys("riyap1196");
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::div[1]")).click();
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.get("https://shop.patelbros.com/products");
//        driver.findElement(By.xpath("//ul[@id='location-list']/li[3]/h4/a")).click();
//        driver.findElement(By.xpath("//div[@id='price-list-2']/ul/li/h5")).click();
//        driver.findElement(By.xpath("//img[@alt='Fresh Punjabi Samosa 1 Piece']")).click();
//        driver.findElement(By.id("update-btn")).click();
//        driver.findElement(By.xpath("//img[@alt='Whole Wheat Fresh Roti Chappati 4 Pieces']")).click();
//        driver.findElement(By.xpath("//section[@id='ngdialog3-aria-describedby']/div/div[2]/div/h2/div/plus-minus-input/div/div/span[2]/button")).click();
//        driver.findElement(By.id("update-btn")).click();
//        driver.findElement(By.xpath("//img[@alt='Red Onions']")).click();
//        driver.findElement(By.xpath("//section[@id='ngdialog4-aria-describedby']/div/div[2]/div/h2/div/plus-minus-input/div/div/span[2]/button/span")).click();
//        driver.findElement(By.id("update-btn")).click();
//        driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[7]/a/span/i")).click();
//        driver.get("https://shop.patelbros.com/cart");
//        driver.findElement(By.linkText("Checkout")).click();
//        driver.findElement(By.xpath("//div[@id='fulfillment-step']/drawer/div[2]/div/ul/li[2]/h3")).click();
//        driver.findElement(By.xpath("//div[@id='fulfillment-step']/drawer/div[2]/div/div/button")).click();
//        driver.findElement(By.xpath("//img[@alt='Patel Brothers']")).click();
//        driver.get("https://shop.patelbros.com/");
//        driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[6]/ul/li[4]/a")).click();
//    }
    //  System.out.println(e.toString());
//    @Test
//    public void testPatel() throws Exception {
//        driver.get(baseUrl + "chrome://newtab/");
//        driver.get("https://shop.patelbros.com/login");
//        driver.findElement(By.name("email")).sendKeys("riyap3231@gmail.com");
//        //driver.findElement(By.name("password")).clear();
//        driver.findElement(By.name("password")).sendKeys("riyap1196");
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::div[1]")).click();
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.get("https://shop.patelbros.com/products");
//        driver.findElement(By.xpath("//ul[@id='location-list']/li[3]/h4/a")).click();
//        driver.findElement(By.xpath("//div[@id='price-list-2']/ul/li/h5")).click();
//        driver.findElement(By.xpath("//img[@alt='Fresh Punjabi Samosa 1 Piece']")).click();
//        driver.findElement(By.id("update-btn")).click();
//        driver.findElement(By.xpath("//img[@alt='Whole Wheat Fresh Roti Chappati 4 Pieces']")).click();
//        driver.findElement(By.xpath("//section[@id='ngdialog3-aria-describedby']/div/div[2]/div/h2/div/plus-minus-input/div/div/span[2]/button")).click();
//        driver.findElement(By.id("update-btn")).click();
//        driver.findElement(By.xpath("//img[@alt='Red Onions']")).click();
//        driver.findElement(By.xpath("//section[@id='ngdialog4-aria-describedby']/div/div[2]/div/h2/div/plus-minus-input/div/div/span[2]/button/span")).click();
//        driver.findElement(By.id("update-btn")).click();
//        driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[7]/a/span/i")).click();
//        driver.get("https://shop.patelbros.com/cart");
//        driver.findElement(By.linkText("Checkout")).click();
//        driver.findElement(By.xpath("//div[@id='fulfillment-step']/drawer/div[2]/div/ul/li[2]/h3")).click();
//        driver.findElement(By.xpath("//div[@id='fulfillment-step']/drawer/div[2]/div/div/button")).click();
//        driver.findElement(By.xpath("//img[@alt='Patel Brothers']")).click();
//        driver.get("https://shop.patelbros.com/");
//        driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[6]/ul/li[4]/a")).click();
      
//    }
    @Test
    public void testCSS() throws InterruptedException {
//Maximize browser window 
        driver.manage().window().maximize();
        driver.get("https://shop.patelbros.com/login");
// Here Tag = input and Class = email 

        driver.findElement(By.name("email")).sendKeys("riyap3231@gmail.com");
        driver.findElement(By.name("password")).sendKeys("riyap1196");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Select This Location")).click();
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li")).click();
        driver.findElement(By.xpath("//div[@id='Produce']/div/ul/li[6]/hs-product-item/div/div/div/div[2]/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("//div[@id='Produce']/div/ul/li[7]/hs-product-item/div/div/div/div[2]/div/div[2]/div/a")).click();
        driver.get("https://shop.patelbros.com/cart");
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.xpath("//div[@id='fulfillment-step']/drawer/div[2]/div/div/button")).click();

    }

}
