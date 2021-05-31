package Sign_in;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Login {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void Login_Account() {
//		open web site 
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
//		click "Sign in"
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
//		input email and password valid
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("son814349@test.com");
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("passwd")).sendKeys("Son02091997");
		
//		click button "Sign in"
		driver.findElement(By.id("SubmitLogin")).click();
		
//		valid login successfully
		String string = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")).getText();
		if(string.contains("Vu Duc Son")) {
			System.out.println("Login successfully");
		}
		else {
			System.out.println("Login Failed");
		}
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
