package com.selenium.selenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class DynamicLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qahofin.bracits.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement username = driver.findElement(By.cssSelector("input[type*='mail']"));
        username.clear();
        username.sendKeys("dijendra.nm@brac.net");
        System.out.println(username.getTagName());
        System.out.println(username.isDisplayed());
        System.out.println(username.getRect());
        WebElement password = driver.findElement(By.cssSelector("input[type^='pass']"));
        password.sendKeys("1234");
        driver.findElement(By.cssSelector("button[type$='mit']")).click();

        ///links///

     /*   List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links");
        if (links.size()!=0){
            for (WebElement webElement : links){
                String link = webElement.getAttribute("href").trim();
                if (link !=null && !link.isEmpty()){
                    System.out.println("link");
                }
        }


    }
*/

}
}
