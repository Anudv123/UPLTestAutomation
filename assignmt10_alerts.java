package assignmentphase1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignmt10_alerts {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(" https://demo.automationtesting.in/Alerts.html");
	/*
	driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
	 // Switch to the alert
    Alert alert = driver.switchTo().alert();
    // Get the text of the alert
    System.out.println("Alert Text: " + alert.getText());
    // Accept the alert (click OK)
    alert.accept();
    
    //alert with cancel
    driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
    driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
    Alert alert2 = driver.switchTo().alert();
    System.out.println("alert ok and cancel:  "  + alert2.getText());
    //alert.accept();
    alert2.dismiss();
    */
    
    //alert with textbox
    driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();

    Alert alert3 = driver.switchTo().alert();
    System.out.println("alert with textbox : " + alert3.getText());  
    alert3.accept();
    
  //alert3.sendKeys("hi");
    Thread.sleep(1000);
  //  JavascriptExecutor js = (JavascriptExecutor) alert3;

  //  js.executeScript("var myPrompt = prompt('hi:', 'Initial Text');");

    // Clear the text within the prompt dialog
    //js.executeScript("myPrompt = '';");




	}

}
