package Amazon01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAsNegativeTestCase {
	
	@Test
	public void login() {
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"); 
	driver.findElement(By.id("ap_email")).sendKeys("789386366");
	driver.findElement(By.name("password")).sendKeys("Abcd");
	
	driver.findElement(By.className("a-button-input")).click();
	
	String VerifyTitle = driver.getTitle();
	String ActualTitle = "https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
	Assert.assertEquals(VerifyTitle, ActualTitle);
	System.out.println("Titles are not equal, Please input Correct Login and Password");
	
	
	
	}

}
