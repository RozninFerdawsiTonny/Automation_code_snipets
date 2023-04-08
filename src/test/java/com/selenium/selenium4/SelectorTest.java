package com.selenium.selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectorTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://erpstaging.brac.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement username = driver.findElement(By.cssSelector("input[type*='text']"));
        username.clear();
        username.sendKeys("8811");
        WebElement password = driver.findElement(By.cssSelector("input[type*='password']"));
        password.clear();
        password.sendKeys("abc123$");
        driver.findElement(By.cssSelector("button[type*=button]")).click();
        //===Navigate===//
        driver.navigate().to("https://erpstaging.brac.net/node/mfDashboard#!/loanProposal/list");
        // driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
        //===Selector===//
        //Select select = new Select(driver.findElement(By.cssSelector("select[name*='productId']")));
        WebElement product = driver.findElement(By.cssSelector("select[name*='productId']"));
        Select select = new Select(product);
        //===select 4 vabe nea jai==//
        select.selectByValue("137");
        // select.selectByIndex(3);
        // select.selectByVisibleText("[BD-10113] - Shadhin Loan 24% (Single )");
       /* for (WebElement option : select.getOptions()){
            System.out.println(option.getText());
        }*/
    }
}
