package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		driver.get("https://www.path2usa.com/travel-companions");
		//April 23
		
		WebElement date=driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
		executor.executeScript("arguments[0].click();",date);

		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("April"))
		{
		driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}


		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=dates.size();

		for(int i=0;i<count;i++)
		{
		String text=dates.get(i).getText();
		if(text.equalsIgnoreCase("14"))
		{
		dates.get(i).click();
		break;
		}

		}
		
	}

}
