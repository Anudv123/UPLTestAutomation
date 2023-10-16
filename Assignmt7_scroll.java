package assignmentphase1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignmt7_scroll {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();

driver.get("https://practice.expandtesting.com/scrollbars");
driver.manage().window().maximize();

WebElement playground=driver.findElement(By.xpath("//body/main[@class='flex-shrink-0 py-3']/div[@class='page-layout']/div[@class='container']/div[@class='row']/div[@class='col-md-9']/div[1]")); 
WebElement bttn= driver.findElement(By.xpath("//button[@id='hidingButton']"));
//playground.click();

//JavascriptExecutor js = (JavascriptExecutor) bttn;



Actions act=new Actions(driver);

//Min slider
//WebElement min_slider=driver.findElement(By.xpath("//body//div//span[1]"));
System.out.println("current location of min slider:"+bttn.getLocation());// (58, 249)

act.dragAndDropBy(bttn, 58, 249).perform();
	}

}
