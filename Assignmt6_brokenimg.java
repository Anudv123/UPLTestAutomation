package assignmentphase1;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignmt6_brokenimg {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practice.expandtesting.com/broken-images");



List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println(images.size());//13

int brokenimg=0;

for (WebElement image:images)
{
	String imgurl=image.getAttribute("src");
	
	if (imgurl!=null && imgurl.isEmpty())
	{
		System.out.println("img attribute is null or empty not possible to check this link");
		continue;		
	}
	try
	{
		URL url=new URL(imgurl);
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		conn.connect();
		if(conn.getResponseCode()!=200)
		{
			 System.out.println("Broken image found: " + imgurl + " (HTTP Status Code: " + conn.getResponseCode() + ")");
			//System.out.println(imgurl+ "====> broken img");
			brokenimg++;
		}
		else
		{
			System.out.println(imgurl+"======>NOT Broken img");
		}
		}
		catch(Exception e) {}
	}
System.out.println("TOtal no of brokenimg : " +brokenimg);

	}

}
