package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GersangWeb {
	private final String url = "https://www.gersang.co.kr/main/index.gs";
	private WebDriver driver;

	public GersangWeb() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

	public void login(String id, String password) {

		WebElement inputId = driver.findElement(By.id("GSuserID"));
		inputId.sendKeys(id);

		WebElement inputPassword = driver.findElement(By.id("GSuserPW"));
		inputPassword.sendKeys(password);

		WebElement submitButton = driver.findElement(By.id("btn_Login"));
//	        submitButton.click();

		// driver.quit();
	}

	public void logout() {

		WebElement logoutButton = driver.findElement(By.id("btn_Login"));
		logoutButton.click();

		driver.quit();
	}

}
