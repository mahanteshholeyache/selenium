package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigate_forword_back_refersh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				 driver.navigate().to("https://www.facebook.com/"); 
				 Thread.sleep(1000);
				driver.navigate().back(); 
				Thread.sleep(1000);
				driver.navigate().forward(); 
				Thread.sleep(1000);
				driver.navigate().refresh();
				driver.close();
				}
				


	}

