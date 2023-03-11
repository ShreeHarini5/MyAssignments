package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.className("sectionTabButtonUnselected")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ShreeHarini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");

		// to select a drop down
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourceDD);
		// select by index
		sec.selectByIndex(2);

		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select sec2 = new Select(currency);
		// select by value
		sec2.selectByValue("INR");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec3 = new Select(ownership);
		// select by visible text
		sec3.selectByVisibleText("Corporation");

		driver.findElement(By.name("submitButton")).click();
	}

}
