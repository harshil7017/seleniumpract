package seleniumpract;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login  {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	
	String str=Util.getalert(driver);
System.out.println(str);
driver.close();

if(str.equals("Please enter a valid user name"))
{
	System.out.println("verified ");
}
else
{
	System.out.println("not verified");
}
	
	
	}

}
