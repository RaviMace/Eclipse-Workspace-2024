package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgrameOneDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
