package day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UPL_Logintest {

	public static void main(String[] args) throws InterruptedException {
		//1.lunch the browser
		System.out.println("Provide browser name : ");
		Scanner sc=new Scanner(System.in);
		String bn=sc.next();		
		
		WebDriver driver=null;
		
		 if(bn.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();//chrome browser
		 }
		 else if (bn.equalsIgnoreCase("edge"))
		 {
			 driver =new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Provide proper browser name ");
			 driver .quit();
		 }
		
		 driver.manage().window().maximize();
		//2. open url
		driver.get("http://194.195.119.204:3000");
		Thread.sleep(3000);
		
	
	driver.findElement(By.xpath("//*[@id='navbarCollapse']/div/a[4]")).click();
		Thread.sleep(3000);
	
	
		//3.provide username
	driver.findElement(By.name("identifier")).sendKeys("executor");
	//4. Provide password
	
	driver.findElement(By.name("password")).sendKeys("executor123@upl");
	
	//5.click on login 
	driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
	//(By.xpath("//*[@id='root']/div/div[4]/div/div[2]/form/div/div/div/div/div/div[4]/button")).click();
	
	//6. dashboard  
String txt=driver.getTitle();  
System.out.println(txt);

String exp_value="Unlimited Power of Learning";
if (txt.equals(exp_value))
{
	System.out.println("Login Test Passed");
}
else
{
	System.out.println("Login test Failed");
}
		
//7.close driver

driver.quit();
	}

}
