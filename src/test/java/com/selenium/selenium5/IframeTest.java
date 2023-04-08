package com.selenium.selenium5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class IframeTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("==============");
        System.out.println(driver.findElement(By.id("framesWrapper")).getText());
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.id("framesWrapper")).getText());
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
    }
}
