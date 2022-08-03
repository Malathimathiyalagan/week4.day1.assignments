package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAlltheValuesInTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement text1 = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td[1]"));
		String library1 = text1.getText();
		System.out.println(library1);
		List<String> marketShare = new ArrayList<String>();						
		for(int i = 2 ; i<=4 ;i++) {
			 String market = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td["+i+"]")).getText();
			 marketShare.add(market);
			
		}
		 System.out.println("Values : "+marketShare);
		 
		 WebElement text2 = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td[1]"));
		 String library2 = text2.getText();
		 System.out.println(library2);
		 List<String> AbsoluteUsage = new ArrayList<String>();
		 for(int j = 2 ; j<=4 ;j++) {
			 String absUsage = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td["+j+"]")).getText();
			 AbsoluteUsage.add(absUsage);
			
		}
		 System.out.println("Values : "+AbsoluteUsage);
	}

	}


