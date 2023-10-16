package assignmentphase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignt2_radiobuttn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://practice.expandtesting.com/radio-buttons");
		driver.findElement(By.xpath("//input[@id='red']"));
		driver.findElement(By.id("red")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='basketball']"));
		driver.findElement(By.xpath("//input[@id='tennis']")).click();
	}

}
