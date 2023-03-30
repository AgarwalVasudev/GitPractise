package Practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverscopeAndLinksOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
        //1. Give me the count of links on the page.

System.out.println(driver.findElements(By.tagName("a")).size());

WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
//2. Count of footer section-
System.out.println(footerdriver.findElements(By.tagName("a")).size());

//3-First column of footer section
WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
System.out.println(coloumndriver.findElements(By.tagName("a")).size());
List<WebElement> footerLInks=coloumndriver.findElements(By.tagName("a"));
//4- click on each link in the coloumn and check if the pages are opening-
for(int i=1;i<footerLInks.size();i++)
{
	
	String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	footerLInks.get(i).sendKeys(clickonlinkTab);
	Thread.sleep(5000L);
	
}
ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
for(int j=0;j<windows.size();j++)
{
	System.out.println(driver.switchTo().window(windows.get(j)).getTitle());
}
	}

}
