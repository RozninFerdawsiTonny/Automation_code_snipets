package com.selenium.selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChormeDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//       ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(6000);

        driver.quit();
    }
}
