package com.selenium.selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserFirefox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver Driver=new FirefoxDriver();
        Driver.get("https://www.google.com/");
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        System.out.println(Driver.getTitle());
        System.out.println(Driver.getCurrentUrl());
        Driver.quit();
    }
}
