package seleniumpract;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redirections 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wallethub.com/profile");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for(int i=1;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			String a=(links.get(i).getText());
			
		}
		
		
		
	
	}

}
