import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
public class TestCase1LogInLogOut {

	public static void main(String[] args) throws InterruptedException {
		String name = "You are successfully logged in.";

		System.setProperty("webdriver.chrome.driver",
				"C:/AMBUJA_MOHANTY_D_Drive/STUDY/Ambuja's Study collection/ChromedriverVersion 115.0.5790.102/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputUsername")).sendKeys("ambujamohanty@gmail.com");// Locator 1: ID
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");// Locator 2: Name
		driver.findElement(By.className("signInBtn")).click(); // Locator 3: ClassName
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		System.out
				.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText());
		Assert.assertEquals(
				(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText()),
				"Hello ambujamohanty@gmail.com,");
		driver.findElement(By.xpath("//*[text() = 'Log Out']")).click();
		driver.close();

	}



	}


