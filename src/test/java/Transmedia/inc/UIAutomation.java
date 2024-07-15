package Transmedia.inc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		driver.manage().window().maximize(); 
		driver.get("http://localhost:3000/");
		driver.findElement(By.xpath("//h1[normalize-space()='Create new board']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Add board title']")).sendKeys("Demo Test", Keys.ENTER);
		Thread.sleep(2000);
		
		{		for (int i = 1; i <= 2; i++) {
            WebElement inputElement = driver.findElement(By.xpath("//input[@data-cy='add-list-input']"));
            String testName = String.format("Test", +i);
            inputElement.sendKeys(testName + i, Keys.ENTER);
            Thread.sleep(2000);
        }
		
		driver.findElement(By.xpath("//div[@class='inline-block']//div[2]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='block py-1 px-2 pt-2 text-sm text-gray-700 hover:bg-gray1 active:bg-gray2 cursor-pointer text-red-600']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	}
	

}
