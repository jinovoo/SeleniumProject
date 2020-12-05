package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocateByPatternMatchCss {
	static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().window().maximize();
		System.out.println("Perform on a search on attribute id starting with c using css");
		List<WebElement> startsiwthidcss = driver.findElements(By.cssSelector("[id^='c']"));
		System.out.println("Number of elements starting with c = " + startsiwthidcss.size());
		for(WebElement element : startsiwthidcss){
			System.out.println(element.getAttribute("id"));
		}
		
		System.out.println("Perform on a search on attribute name containing on height using css");
		List<WebElement> containsnameheightcss = driver.findElements(By.cssSelector("[name*='height']"));
		System.out.println("Number of elements containing height = " + containsnameheightcss.size());
		for(WebElement element : containsnameheightcss){
			System.out.println(element.getAttribute("name"));
		}
		
		System.out.println("Perform on a search on attribute id ending with weight using css");
		List<WebElement> endswithidweightcss = driver.findElements(By.cssSelector("[id$='weight']"));
		System.out.println("Number of elements ends with weight = " + endswithidweightcss.size());
		for(WebElement element : endswithidweightcss){
			System.out.println(element.getAttribute("id"));
		}
	
	}
}
