package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//implicit wait
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).isSelected());
         Select s=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
         s.selectByVisibleText("Student");
		driver.findElement(By.id("signInBtn")).click();
		//w.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("iphone X")));
		List<WebElement> addToCArt=driver.findElements(By.className("btn-info"));
		for(int i=0;i<addToCArt.size();i++)
		{
			addToCArt.get(i).click();
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		
		
	}
	
}
