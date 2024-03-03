package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chechbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//label[@for='caddoptional']//span[@class='cbmark']")).click();
				Thread.sleep(1000);
				System.out.println("The Output of the IsSelected " + driver.findElement(By.xpath("//label[@for='caddoptional']//span[@class='cbmark']")).isSelected());
				System.out.println("The Output of the IsEnabled " + driver.findElement(By.xpath("//label[@for='caddoptional']//span[@class='cbmark']")).isEnabled());
				System.out.println("The Output of the IsDisplayed " + driver.findElement(By.xpath("//label[@for='caddoptional']//span[@class='cbmark']")).isDisplayed());
				driver.close();

	}

}
