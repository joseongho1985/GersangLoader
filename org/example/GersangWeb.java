package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GersangWeb {
	private final String url;
	private final String logout;
	private WebDriver driver;

	public GersangWeb() {
		url = "https://www.gersang.co.kr/main/index.gs";
		logout = "https://www.gersang.co.kr/member/logoutProc.gs";
	}

	public void login(String id, String password) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		WebElement inputId = driver.findElement(By.id("GSuserID"));
		inputId.sendKeys(id);

		WebElement inputPassword = driver.findElement(By.id("GSuserPW"));
		inputPassword.sendKeys(password);

		WebElement loginButton = driver.findElement(By.id("btn_Login"));
		loginButton.click();

		// driver.quit();
	}

	public void logout() {
		driver = new ChromeDriver();
		driver.get(logout);
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.quit();
	}

}
