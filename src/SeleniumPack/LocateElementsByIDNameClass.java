package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByIDNameClass {

	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");   
		   driver = new ChromeDriver();
		   driver.get("https://www.calculator.net/calorie-calculator.html");
		   WebElement ageTextbox = driver.findElement(By.id("cage"));
		   ageTextbox.clear();
		   ageTextbox.sendKeys("45");
		   Thread.sleep(3000);
		   
		   System.out.println("attribute value of type of ageTextbox = " + ageTextbox.getAttribute("type"));
		   System.out.println("attribute value of id of ageTextbox = " + ageTextbox.getAttribute("id"));
		   System.out.println("attribute value of name of ageTextbox = " + ageTextbox.getAttribute("name"));
		   System.out.println("attribute value of class of ageTextbox = " + ageTextbox.getAttribute("class"));
		   System.out.println("attribute value of value of ageTextbox = " + ageTextbox.getAttribute("value"));
		   System.out.println("CSS value of width of ageTextbox = " + ageTextbox.getCssValue("width"));
		   System.out.println("Tagname of ageTextbox = " + ageTextbox.getTagName());
		   
//		   WebElement heightTextbox = driver.findElement(By.id("cheightmeter"));
//		   heightTextbox.clear();
//		   heightTextbox.sendKeys("180");
//		   Thread.sleep(3000);
		   
			//for List import the right package java.util.List
			List<WebElement> genderList = driver.findElements(By.name("csex"));
			for(WebElement gender:genderList)
			{
			  if(gender.getAttribute("value").equals("f"))
			     if(!gender.isSelected())
			     {
			           gender.click();
			           break;
			     }
			}

			Thread.sleep(3000);
			
			WebElement table = driver.findElement(By.className("cinfoT"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			
			//we loop throw all the rows - then with respect to each row, we get the cell values
			
			for(WebElement row : rows)
			{
			  List<WebElement> cols = row.findElements(By.tagName("td"));
			  for(WebElement col : cols)
			   {
			      System.out.print(col.getText() + "\t");
			   }
			   System.out.print("\n"); 
			}
			Thread.sleep(5000);

			driver.close(); //close your current active browser

	}

}
