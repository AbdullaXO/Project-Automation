package Amazon01;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class priceConfirm {
	public void priceOfProduct () throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	
	  driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("launchApplication is executed");
		 Thread.sleep(3000);	

		WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbox.sendKeys("Iphone 15");
			
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		List<WebElement> iphone_price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)", "");

				for(int i=0; i<iphone_price.size(); i++) {
					String text = iphone_price.get(i).getText();
					System.out.println(text);
				}
				 
				String iphone[]= {" 77,900", "1,99,900", "87,900", "1,07,900", "79,000", "1,59,000", "1,19,000", "59,999", "13,039", "11,248" };
				//rays.sort(iphone, Collections.reverseOrder());
				
			Arrays.sort(iphone);

}
}

