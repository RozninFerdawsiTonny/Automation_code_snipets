package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ERPTestCase extends BaseClass{
    @Test
    public void VerifyTitleShouldSucceed(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle().trim(),"..::LOGIN::..");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void VerifyLoginTitleShouldSucceed(){
        String loginText = driver.findElement(By.cssSelector(".floatL")).getText().trim();
        Assert.assertEquals(loginText,"Sign-in");

    }
    /* @Test
       public void VerifyLogoutShouldSucceed(){
           String logout = driver.findElement(By.cssSelector("#btn_login")).getText().trim();
           Assert.assertEquals(logout,"Sign-in");
       }*/
    @Test
    public void LoginShouldSucceed() throws InterruptedException {
        WebElement userName = driver.findElement(By.cssSelector("input[type*='text']"));
        userName.clear();
        userName.sendKeys("8811");
        WebElement password = driver.findElement(By.cssSelector("input[type*='password']"));
        password.clear();
        password.sendKeys("abc123$");
        driver.findElement(By.cssSelector("button[type*=button]")).click();
        Thread.sleep(600);
       /* String logout = driver.findElement(By.linkText("Logout")).getText().trim();
        Assert.assertEquals(logout,"Logout");*/
    }

}
