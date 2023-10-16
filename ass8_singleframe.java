package assignmentphase1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ass8_singleframe {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(" https://demo.automationtesting.in/Frames.html");
	
	WebElement single=driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']"));
	single.click();
	
	driver.switchTo().frame(1);
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
	
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	

	//back to main frame
	//driver.switchTo().parentFrame();
	
	
	//Iframe with in an Iframe
	
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	
	WebElement multipleFrames = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

	
	driver.switchTo().frame(multipleFrames);
	//System.out.println(multipleFrames.getText());
	//Thread.sleep(1000);
	WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerFrame);
//	System.out.println(innerFrame.getText());
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nested Frame");
		

	}

}
