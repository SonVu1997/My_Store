package Sign_in;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterClass;

public class Register_Account {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
  }
  @Test
  public void Register() {
	  
//	  open web site  
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
	  
//	  create account with email
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	  driver.findElement(By.id("email_create")).sendKeys("vuducson@test.com");
	  driver.findElement(By.id("SubmitCreate")).click();
	  String string = driver.getTitle();
	  System.out.println(string);
	  
	  WebElement element = driver.findElement(By.id("SubmitCreate"));
	  Actions action = new Actions(driver);
	  action.click(element).build().perform();
	  
//	  WebDriverWait wait = new WebDriverWait(driver, 3);
//	  wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitCreate")));  
	  
//	  input form information
	  driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
//	  driver.findElement(By.id("customer_firstname")).click();
//	  driver.findElement(By.id("customer_firstname")).sendKeys("Vu Duc");
//	  driver.findElement(By.id("customer_lastname")).sendKeys("Son");
//	  driver.findElement(By.id("passwd")).sendKeys("123456");
//	  
////	  input form address
//	  driver.findElement(By.id("company")).sendKeys("QTC");
//	  driver.findElement(By.id("address1")).sendKeys("14/14 Nguyen Van Luong, P6, Q.GoVap");
//	  driver.findElement(By.id("city")).sendKeys("HCM");
//	  
//	  Select dropdow = new Select(driver.findElement(By.id("id_state")));
//	  dropdow.selectByIndex(3);
//	  
//	  driver.findElement(By.id("postcode")).sendKeys("70000");
//	  
//	  Select oSelectC=new Select(driver.findElement(By.name("id_country")));
//	  oSelectC.selectByVisibleText("United States");
//	  
//	  driver.findElement(By.id("phone_mobile")).sendKeys("0373412234");
//	  driver.findElement(By.id("alias")).sendKeys("My love");
//	  
////	  click button register
//	  driver.findElement(By.id("submitAccount"));
	  
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
