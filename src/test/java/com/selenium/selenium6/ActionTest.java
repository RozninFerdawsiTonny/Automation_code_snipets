package com.selenium.selenium6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class ActionTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement webElement = driver.findElement(By.cssSelector("#nav > li:nth-child(1) > a:nth-child(1)"));
        Actions action = new Actions(driver);
        action.clickAndHold(webElement).perform();
        action.release(webElement).perform();
        //action.contextClick(webElement).perform();
        action.doubleClick(webElement).perform();
        //action.moveToElement(webElement).perform();
        //action.dragAndDrop(webElement).perform();
        ///===Sub menu===///
        WebElement webElement1 = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a:nth-child(1)"));
        WebElement webElement2 = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        WebElement webElement3 = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
        //Actions action1 = new Actions(driver);
        action.moveToElement(webElement1).moveToElement(webElement2).moveToElement(webElement3).perform();

        driver.navigate().to("https://demoqa.com/droppable");
        WebElement drag = driver.findElement(By.cssSelector("div[id ='draggable']"));
        WebElement drop = driver.findElement(By.cssSelector("div[id ='droppable']"));
        action.dragAndDrop(drag,drop).perform();
        Thread.sleep(3000);

        driver.quit();

    }
}
