import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/AMBUJA_MOHANTY_D_Drive/STUDY/ChromeDriver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");// URL
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Ambuja");
		driver.findElement(By.name("email")).sendKeys("Am@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rs@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select amb = new Select(dropdown);
		amb.selectByVisibleText("Female"); // static dropwdown 
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/1996");
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		driver.quit();
		
		
		
		

	}

}
