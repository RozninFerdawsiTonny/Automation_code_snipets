package com.selenium.selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qahofin.bracits.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement element = driver.findElement(By.name("email"));
        element.clear();
        element.sendKeys("dijendra.nm@brac.net");
        WebElement element1 = driver.findElement(By.id("password"));
        element1.sendKeys("1234");
       driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[3]/button")).click();
       // driver.navigate().to("https://qahofin.bracits.com/brac/lc-setup/list");
        Thread.sleep(1000);
        driver.findElement((By.cssSelector("a[href*=submenu3]"))).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href*='lc-setup'] span")).click();
        //driver.navigate().to("https://qahofin.bracits.com/brac/lc-setup/list");
        driver.findElement(By.cssSelector("div .row a[href*='lc-setup/add']")).click();
        

        Thread.sleep(3000);

        driver.quit();
    }
}
