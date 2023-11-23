package Amazon01;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NewTest {
  @Test

		
	  public void f() throws InterruptedException {
		  
		  ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			// Maximazie the  window 
			 driver.manage().window().maximize();
			 //It will clear the Exception using Thread command
			 Thread.sleep(1000);
			 // User want to search the product in search option
			 Scanner obj = new Scanner (System.in);	 			
			 System.out.println("What do you want to search");
			 String a = obj.nextLine();
			 Thread.sleep(3000);
			// enter the product and click on search button
			 WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
			 searchbox.sendKeys(a);	
			WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
			searchbutton.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,300)", "");	
			  // user find the required product click on the product
			WebElement Product = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
			Product.click();
			// By clicking on product it should navigate to next tab
			
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
		          driver.switchTo().window(windowHandle);
		          if (driver.getTitle().contains("Apple iPhone 15")) {
		        	  System.out.println("Title of the new window: " + driver.getTitle());
		        	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		     		 js1.executeScript("window.scrollBy(0,300)", "");	
		     		 WebElement addtocart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		     		 addtocart.click();
		     		//WebElement cart = driver.findElement(By.xpath("//input[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
		     		 //cart.click();	  
	  }
}
  }
}
