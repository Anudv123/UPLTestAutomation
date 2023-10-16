package assignmentphase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropdemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get(" https://practice.expandtesting.com/drag-and-drop");
		

		
		//Element to be dragged //
		WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		//Element to drag to //
		WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));
		Thread.sleep(1500);
		Actions	action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		//close the driver
		driver.quit();

	}

}
