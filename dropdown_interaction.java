package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_interaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/interest-calculator.html");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		Thread.sleep(1000);
		dropdown.selectByVisibleText("annually");
		Thread.sleep(1000);
		System.out.println("The Output of the IsSelected " + driver.findElement(By.id("ccompound")).isSelected());
		System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("ccompound")).isEnabled());
		System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("ccompound")).isDisplayed());
		driver.close();
	}

}
