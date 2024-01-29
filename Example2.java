import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Himaja Cherukuri");
		
		driver.findElement(By.id("userEmail")).sendKeys("hima@gmail.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Gachibowli, Hyderabad");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("Madhira, Khammam Dist");
		
		
		driver.findElement(By.id("submit")).click();

		
		
	}

}
