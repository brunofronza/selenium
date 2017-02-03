import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTestNG {

	@Test
	public void f() {
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bruno_fronza_junior\\Downloads\\geckodriver-v0.14.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("http://www.globo.com/");
		
		String a = "'I'm Feeling Lucky";
		String b = "Google Search";
		String c = "//p[@class='hui-premium__title']";
		
//		wait and expected conditions
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='"+b+"']")));				
//		WebElement button = driver.findElement(By.xpath("//input[@value='"+b+"']"));
//		WebElement button = driver.findElement(By.xpath("//input[@value='"+b+"']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(c)));
		WebElement button = driver.findElement(By.xpath(c));		
		button.click();
		
		System.out.println("Clicou");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		driver.close();
		driver.quit();
	

	}
}
