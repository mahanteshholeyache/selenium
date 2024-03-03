package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login_in_hotelapp {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				driver.get("https://adactin.com/HotelApp/index.php"); 
				driver.manage().window().maximize();
				WebElement un=driver.findElement(By.id("username")); 
				un.sendKeys("Mahantesh");
				Thread.sleep(1000);
				WebElement psw=driver.findElement(By.name("password")); 
				psw.sendKeys("mahan1998");
				Thread.sleep(1000);
				WebElement log=driver.findElement(By.id("login")); 
				log.click();
				driver.close();



	}

}
