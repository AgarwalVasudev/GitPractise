package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parul\\OneDrive\\Documents\\Testing\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/seleniumPractise/");
int count = 0;
String[] items= {"Brocolli","Cucumber","Carrot"};
List itemsNeededList = Arrays.asList(items);
List<WebElement> names=driver.findElements(By.xpath("//h4[@class='product-name']"));

for(int i=0;i<names.size();i++)
{
	String[] name=names.get(i).getText().split("-");
	String formatName=name[0].trim();
	
	if(itemsNeededList.contains(formatName)) {
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		Thread.sleep(2000);
		count ++;
		if(itemsNeededList.size()==count)
			break;
	}
	
}


	}

}
