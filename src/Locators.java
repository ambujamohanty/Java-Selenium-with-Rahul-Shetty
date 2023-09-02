import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/AMBUJA_MOHANTY_D_Drive/STUDY/Ambuja's Study collection/ChromedriverVersion 115.0.5790.102/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("ambujamohanty@gmail.com");// Locator 1: ID
		driver.findElement(By.name("inputPassword")).sendKeys("Chittamul");// Locator 2: Name
		driver.findElement(By.className("signInBtn")).click(); // Locator 3: ClassName
		String errMsg = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(errMsg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ambuja Mohanty");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ambujamohanty@gmail.co");
		// driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9018938983");//indexing
		// method
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();// to clear email value
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ambujamohanty@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9018938983");// using parent child traverse
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // .classname is also another way of writting css
																		// selector
		// String infoMsg = driver.findElement(By.cssSelector(".infoMsg")).getText(); //
		// using Css selector
		// String infoMsg = driver.findElement(By.xpath("//p[@class =
		// 'infoMsg']")).getText(); // using xpath
		// System.out.println(infoMsg);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());// Parent child traverse in CSS
		driver.findElement(By.className("go-to-login-btn")).click(); // selector
        Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("ambujamohanty@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");// partial link text
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.close();

	}

}
