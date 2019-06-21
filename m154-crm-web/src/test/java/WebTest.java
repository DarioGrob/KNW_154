//import static org.junit.Assert.assertTrue;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class WebTest {
//
//WebDriver driver;
//	
//	@Before
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "C:/dev/chromedriver.exe");
//		
//		
//		ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        
//        driver = new ChromeDriver(options);
//        
//        driver.get("http://www.google.com");
//        
//        driver.manage().window().maximize();
//        
//        driver.get("http://localhost:7070");
//	}
//	
//	@Test
//	public void testProduct() {
//		driver.findElement(By.linkText("Manage Products")).click();
//		driver.findElement(By.name("description")).sendKeys("Test");
//		driver.findElement(By.xpath("/html/body/form[1]/p/input")).click();
//		
//		WebElement output = driver.findElement(By.xpath("/html/body/span"));
//		String productnumber = output.getText();  //.split(" |,")[1];
//		
//		driver.findElement(By.xpath("/html/body/form[2]/input")).sendKeys(productnumber);;
//		driver.findElement(By.xpath("/html/body/form[2]/p/input")).click();
//		
//		String productOutput = driver.findElement(By.xpath("/html/body/span[2]")).getText();
//		
//		assertTrue(productOutput.trim().contains("Test"));
//	}
//}
