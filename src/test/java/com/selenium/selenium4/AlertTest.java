package com.selenium.selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     //==single Alert==//
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
         //Alert alert = driver.switchTo().alert();
        //===ConfirmButton Alert===//
        driver.findElement(By.id("confirmButton")).click();
        Alert ConfirmButton = driver.switchTo().alert();
        System.out.println(ConfirmButton.getText());
        ConfirmButton.dismiss();
        Thread.sleep(200);
        //===Prompt Alert===//
        driver.findElement(By.id("promtButton")).click();
        Alert Prompt = driver.switchTo().alert();
        Prompt.sendKeys("PromptAlert");
        Thread.sleep(200);
        System.out.println(Prompt.getText());
        Prompt.accept();
        Thread.sleep(200);
    }
}
