package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableLeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//to get the count of number of rows
		int row = driver.findElements(By.xpath("//table//tr")).size();
		System.out.println("No.of rows: "+row);
		//Get the count of number of columns
		int columns = driver.findElements(By.xpath("//table//th")).size();
		System.out.println("No.of columns: "+columns);
		
		//to get the progress value of 'Learn to interact with Elements'

		for (int i = 3; i <=5; i++) {
		List<WebElement> columnsize= driver.findElements(By.xpath("//table//tr["+i+"]//td"));
		
		int size = columnsize.size();
		for (int j = 1; j <size; j++) {
		String text2 = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
		System.out.println(text2);
			
			}
		}
		//to find min value
		List<WebElement> leastprogress = driver.findElements(By.tagName("tr"));	
		List<String> values = new ArrayList<String>();
		for (int k = 1; k < leastprogress.size(); k++) {
		values.add(leastprogress.get(k).getText());
		System.out.println(leastprogress.get(k).getText());
		
	}
		Object obj =Collections.min(values);
		System.out.println("Minimum Value : "+obj);
		driver.findElement(By.xpath("//table//tr[6]/td[3]/input")).click();
	}

}
