package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittogarh {

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.chittorgarh.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
			driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
			//to get the heading as Security Name
			String header = driver.findElement(By.linkText("Security Name")).getText();
			System.out.println(header);
			//to know the size
			List<WebElement> securityname = driver.findElements(By.xpath("(//table)[2]//tr"));
			int sizeOfname = securityname.size();
			System.out.println(sizeOfname);
			
			 List<String> securityList=new ArrayList<String>();				
			 //Get all the Security names
			for(int i =1; i < sizeOfname; i++) {
			
			String names = driver.findElement(By.xpath("(//table)[2]//tbody//tr["+i+"]/td[3]")).getText();
			System.out.println(names);
			securityList.add(names);
			}
			//to remove duplicate
			Set<String>removedup=new LinkedHashSet<String>(securityList);
			int size = removedup.size();
			removedup.add(null);//to display security names after set
			System.out.println(removedup);
			System.out.println("**After removing duplicate**   " +size);
		    //to confirm whether there are duplicate Security names
			if(securityList.size()== removedup.size()) {
				System.out.println("It has no duplicates  " +removedup.size() );
			}
			else {
			
				System.out.println("It has duplicates   " +securityname.size());
			}
			
			
			
			
           // driver.quit();
	}

}
