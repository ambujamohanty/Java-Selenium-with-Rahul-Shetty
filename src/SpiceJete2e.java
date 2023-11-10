import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJete2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/AMBUJA_MOHANTY_D_Drive/STUDY/ChromeDriver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");// URL
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).click();
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind"); // Seelct India from auto suggestive
																					// drpdown
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // click from Station,Dynamic
																						// dropdown

		// Select from Station
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']"))
				.click();
		Thread.sleep(2000);
		// Select to station
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(2000);
		// selecting the current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //
		// Click on family friends check box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) // using for loop
		{
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
			// i++; //increment
		}
		Thread.sleep(1000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
		driver.quit();

	}

}
