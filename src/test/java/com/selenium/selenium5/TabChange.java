package com.selenium.selenium5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;

public class TabChange {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("==============");
        String originalwindows = driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://qahofin.bracits.com/login");
        //  driver.findElement(By.id("sampleHeading")).getText();
        Set<String> windows = driver.getWindowHandles();
        driver.close();
        // driver.quit();
        System.out.println(windows.size());
        driver.switchTo().window(originalwindows);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://qahofin.bracits.com/login");
        windows = driver.getWindowHandles();
        System.out.println(windows.size());
        driver.switchTo().window(originalwindows);
        driver.close();
    }
}
