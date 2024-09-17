package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class Projectatm {
	
	
	WebDriver driver;
	
	
	@FindBy(xpath ="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement categories;
	
	@FindBy(xpath = "//*[@id=\"input-sort\"]/option[2]")
	WebElement fish_by;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement seawater_quiries;
	
	@FindBy(xpath = "//input[@id='Quantity']")
	WebElement send_quries_quantity;
	
	@FindBy(xpath = "//*[@id=\'Enquiry\']")
	WebElement send_quries_enquiry;
	
	@FindBy(xpath = "//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement send_quries_send;
	
	@FindBy(xpath = "//*[@id=\"search\"]/input")
	WebElement search;
	
	public Projectatm(WebDriver driver)
	{
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	public void categories_click() throws InterruptedException
	{
		
	categories.click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,400);");
	Thread.sleep(3000);
	
	}
	
	public void fish_by_click() throws InterruptedException
	{
		
	fish_by.click();
	Thread.sleep(3000);
	
	}
	
	public void seawater_quiries_click() throws InterruptedException
	{
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,600);");
	Thread.sleep(3000);
	seawater_quiries.click();
	
	}
	public void pop_up() throws InterruptedException
	{
	//send_quries_quantity.click();
	Thread.sleep(3000);
	send_quries_quantity.clear();
	send_quries_quantity.sendKeys("6");
	send_quries_enquiry.clear();
	send_quries_enquiry.sendKeys("fish");
	send_quries_send.click();
	}
	public void search_click() throws InterruptedException
	{
	driver.navigate().refresh();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,0);");
	search.sendKeys("licious",Keys.ENTER);
	}
	}


