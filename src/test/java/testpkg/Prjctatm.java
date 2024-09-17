package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pagepkg.Projectatm;

public class Prjctatm {
	
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.get("https://www.licious.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	@Test
	public void tests() throws Exception
	{
	Projectatm ob=new Projectatm(driver);
	ob.categories_click();
	ob.fish_by_click();
	ob.seawater_quiries_click();
	ob.pop_up();
	// ob.search_click();
	}

}
