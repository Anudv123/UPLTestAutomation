package assignmentphase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2_dragndropcircle {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("  https://practice.expandtesting.com/drag-and-drop-circles");
		

		
		//Element to be dragged //
		WebElement red = driver.findElement(By.xpath("//div[@class='red']"));			
		WebElement green= driver.findElement(By.xpath("//div[@class='green']"));
		WebElement blue= driver.findElement(By.xpath("//div[@class='blue']"));
		
		//Element to drag target place //
		WebElement to = driver.findElement(By.xpath("//div[@id='target']"));
		Thread.sleep(1500);
		
		// Create an Actions object
		Actions	action = new Actions(driver);
		
		// Perform drag-and-drop operations
		action.dragAndDrop(red, to).build().perform();
		action.dragAndDrop(green, to).build().perform();
		action.dragAndDrop(blue, to).build().perform();
		
		//close the driver
		driver.quit();

	}

}
