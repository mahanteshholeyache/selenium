package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement mobiles = driver.findElement(By.linkText("//img[@alt='Mobiles']"));
		Actions a=new Actions(driver);
		a.moveToElement(mobiles).perform();
		Thread.sleep(2000);
		//WebElement = 
		//driver.findElement(By.xpath("//span[text()='DevOps Training']"));
		//a.click(devOpTraining).perform()

	}

}
