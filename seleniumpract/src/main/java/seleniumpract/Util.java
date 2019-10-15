package seleniumpract;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;

public class Util 
{
	
	public static String getalert(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
		
	Alert alert=driver.switchTo().alert();
	String str=alert.getText();
	alert.accept();
	driver.close();
	return str;
	}
}

