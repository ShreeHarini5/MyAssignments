package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lanunchapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.facebook.in");
		driver.manage().window().maximize();
		// driver.close();
		driver.manage().window().minimize();
	}
}