package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles()); //[parentid,childid,subchildId]

		//Iterator<String>it = windows.iterator();

		//String parentId = it.next();

	//	String childId = it.next();

		driver.switchTo().window(windows.get(1));

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();

		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(windows.get(0));

		driver.findElement(By.id("username")).sendKeys(emailId);



	}

}
