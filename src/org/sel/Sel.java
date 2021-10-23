package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel {
//<<<<<<< HEAD
	private void push() {
		System.out.println("Conflict");

	}
//=======
	private void con() {
		System.out.println("1919");
	}
	static WebDriver driver;
//>>>>>>> af75edc58e6f3ab89e39d5167ddafbe430ae4e23
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish Babu\\eclipse-workspace\\Selenium-New\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones X");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebDriverWait wait1=new WebDriverWait(driver,5);
		WebElement we1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[2]")));
		Actions moa=new Actions(driver);
		moa.moveToElement(we1).perform();
		moa.contextClick().perform();
		Robot kb=new Robot();
		kb.keyPress(KeyEvent.VK_DOWN);
		kb.keyRelease(KeyEvent.VK_DOWN);
		kb.keyPress(KeyEvent.VK_ENTER);
		kb.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> li=new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(1));
		WebElement we2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("priceblock_ourprice")));
		System.out.println(we2.getText());
		

	}

}
