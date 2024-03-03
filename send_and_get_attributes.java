package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_and_get_attributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("mahantesh");
		driver.findElement(By.id("password")).sendKeys("mahan1998");
		Thread.sleep(1000);
		String un= driver.findElement(By.id("username")).getAttribute("value"); 
		String psw=driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(un);
		System.out.println(psw);
driver.close();

	}

}
