import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		driver.close();
	}
}
