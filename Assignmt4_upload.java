package assignmentphase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmt4_upload {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver. manage().window().maximize();
		driver.get(" https://practice.expandtesting.com/upload");
		 WebElement fileInput=driver.findElement(By.id("fileInput"));
		
		// Specify the path to the file you want to upload
        String filePath = "C:\\Users\\DELL\\Pictures\\abc.png"; 
   
        		 // Update with your file path

        		
     // Send the file path to the file input element
        fileInput.sendKeys(filePath);
        
        driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
	}

}
