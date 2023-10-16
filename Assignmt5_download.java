package assignmentphase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmt5_download {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/download");
		driver.findElement(By.xpath("//a[normalize-space()='1694679385387_monkey-4187960_1280.png']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='1694799660771_katalon-main-image.jpg']")).click();

	}

}
