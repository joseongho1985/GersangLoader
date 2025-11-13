package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public Login(String id, String password){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gersang.co.kr/main/index.gs");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement inputId = driver.findElement(By.id("GSuserID"));
        inputId.sendKeys(id);

        WebElement inputPassword = driver.findElement(By.id("GSuserPW"));
        inputPassword.sendKeys(password);

        WebElement submitButton = driver.findElement(By.id("btn_Login"));
//        submitButton.click();

        // driver.quit();
    }
    
}
