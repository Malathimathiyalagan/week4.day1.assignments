package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRowsAndColumns {

	 public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to get the size of Rows in Table 1&2 
		List<WebElement>totalRows = driver.findElements(By.xpath("//table//tr"));
		int rowSize = totalRows.size();
		System.out.println("Number of Rows in Table 1&2 : "+rowSize );
		
				
		//to get the size of columns in Table 1&2
		List<WebElement> totalcolumns  = driver.findElements(By.xpath("//table//th"));
		int columnSize = totalcolumns.size();
		System.out.println("Number of Columns in Table 1&2 : "+columnSize);

	}

}
