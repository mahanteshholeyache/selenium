package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class get_url_title {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium filesss\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				String title = driver.getTitle();
				System.out.println("Title: "+title);

				String url=driver.getCurrentUrl(); 
				System.out.println("URL: "+url);
				Thread.sleep(2000); 
				driver.close();


	}

}
