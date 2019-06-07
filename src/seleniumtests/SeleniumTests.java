/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author jezreel_avila
 */
public class SeleniumTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
        //System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumDrivers\\Chrome\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://10.100.11.115:9080/isccs/isccs/login.do");
        
        //Select sel = new Select(driver.findElement(By.id("SimpleSearchForm_SearchTerm")));
        //Object obj = driver.findElement(By.id("SimpleSearchForm_SearchTerm"));
        
        String barcode="admin";

        WebElement strLocator = driver.findElement(By.id("idx_form_TextBox_0"));
        strLocator.sendKeys(barcode);
        
        //strLocator.sendKeys(Keys.RETURN);
        
        String pass = "password";
        
        WebElement elmPass = driver.findElement(By.id("loginPassword"));
        elmPass.sendKeys(pass);
        
        elmPass.sendKeys(Keys.RETURN);
        
        try { Thread.sleep(10000); } catch (InterruptedException e) {}
        
        String email = "javila";
        
        WebElement elmEmail = driver.findElement(By.id("idx_form_TextBox_2"));
        elmEmail.sendKeys(email);
        elmEmail.sendKeys(Keys.RETURN);
        
        try { Thread.sleep(4000); } catch (InterruptedException e) {}
        
        WebElement elmStoresTxt = driver.findElement(By.id("idx_form_FilteringSelect_3"));
        elmStoresTxt.sendKeys("americas");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        elmStoresTxt.sendKeys(Keys.DOWN);
        
        /*elmStoresTxt.sendKeys(Keys.DOWN);
        elmStoresTxt.sendKeys(Keys.DOWN);
        elmStoresTxt.sendKeys(Keys.RETURN);*/
        
        
        
    }
    
}
