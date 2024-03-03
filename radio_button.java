package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class radio_button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.calculator.net/mortgage-payoff-calculator.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[normalize-space()='Payback altogether']")).click();
		System.out.println("The Output of the IsSelected " + driver.findElement(By.xpath("//label[normalize-space()='Payback altogether']")).isSelected());
		System.out.println("The Output of the IsEnabled " + driver.findElement(By.xpath("//label[normalize-space()='Payback altogether']")).isEnabled());
		System.out.println("The Output of the IsDisplayed " + driver.findElement(By.xpath("//label[normalize-space()='Payback altogether']")).isDisplayed());
		driver.close();
			
	
		}


	}

