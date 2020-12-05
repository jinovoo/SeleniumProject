package SeleniumPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByxpath {
	static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().window().maximize();
		WebElement ageLabelAbsPath = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[1]/tbody/tr[1]/td[1]"));
		System.out.println("AgeLabel Absolute Path "+ageLabelAbsPath.getText());
		WebElement ageLabelRelPath = driver.findElement(By.xpath("//table[@id='calinputtable']/tbody/tr[1]/td[1]"));
		System.out.println("AgeLabel Relative Path "+ageLabelRelPath.getText());
		
		WebElement ageTextBox = driver.findElement(By.xpath("//*[@id='cage']"));
		ageTextBox.clear();
		ageTextBox.sendKeys("67");
		driver.close();
		
	}
}
