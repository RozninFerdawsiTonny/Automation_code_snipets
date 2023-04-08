package com.selenium.selenium5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;

public class CookiesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("==============");
        driver.manage().addCookie(new Cookie("test", "test"));
        System.out.println(driver.manage().getCookieNamed("test"));
        driver.manage().deleteCookieNamed("test");
       // ============================================//

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cook : cookies ){
            System.out.println(cook.getName()+ "" + cook.getExpiry());
        }
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

    }
}
