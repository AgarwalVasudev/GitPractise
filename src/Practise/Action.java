package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\Testing\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hello");
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList' ]"))).perform();//mouse hover
		a.contextClick(driver.findElement(By.xpath("//a[@id='nav-link-accountList' ]"))).perform();//right click
		
		
	}

}
