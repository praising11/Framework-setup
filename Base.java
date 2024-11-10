package com.Amazon.Seleniumbase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base implements SeleniumAPI {

	RemoteWebDriver driver=null;
	WebDriverWait wait=null;
	
	long maximumwait=10;
	

	@Override
	public void setup(String Url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicitwait
		driver.get(Url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumwait)); // Explicit wait
		
	}

	@Override
	public void setup(Browser Browsername, String Url) {
		switch (Browsername) {
		case CHROME:
			driver=new ChromeDriver();
		  break;
		case FIREFOX:
			driver=new FirefoxDriver();
		  break;
		case EDGE:
			driver=new EdgeDriver();
		  break;


		default:
			System.err.println("driver is not defined");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(Url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumwait)); 

	}

	@Override
	public WebElement Element(Locators type, String value) {
		switch (type) {
		case id:
			return driver.findElement(By.id(value));
			//break;
		case name:
			return driver.findElement(By.name(value));
		case classname:
			return driver.findElement(By.className(value));
		case tagName :
			return	driver.findElement(By.tagName(value));
		case linktext:
			return driver.findElement(By.linkText(value));
		case css:
			return driver.findElement(By.cssSelector(value));
		case xpath:
			return driver.findElement(By.xpath(value));
		case partialLinktext:
			return driver.findElement(By.partialLinkText(value));

		default:
			break;
		}

		return null;
	}

	@Override
	public void windowhandling(int i) {

	}

	@Override
	public void selectvalue(WebElement ele, String value) {
		
	}

	@Override
	public void selecttext(WebElement ele, String text) {
    

	}

	@Override
	public void selectindex(WebElement ele, int position) {

	}

	@Override
	public void click(WebElement ele) {
		WebElement element = wait.withMessage("Element is not clickable").until(ExpectedConditions.elementToBeClickable(ele));
    element.click();

	}

	@Override
	public void type(WebElement ele,String testdata) {
  WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
      element.clear();
      element.sendKeys(testdata);

	}
	
	@Override
	public void type(WebElement ele,String testdata,Keys key) {
  WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
      element.clear();
      element.sendKeys(testdata,key);

	}

	@Override
	public void appendtext(WebElement ele) {


	}

	@Override
	public String GetTitle() {

		return driver.getTitle();
	}

	@Override
	public String Geturl() {

		return driver.getCurrentUrl();
	}

	@Override
	public boolean isdisplayed(WebElement ele) {

		return  ele.isDisplayed();
	}

	@Override
	public boolean isEnabled(WebElement ele) {

		return ele.isEnabled();
	}

	@Override
	public boolean isselected(WebElement ele) {

		return ele.isSelected() ;
	}

	@Override
	public void close() {
		driver.close();

	}

	@Override
	public void quit() {
		driver.quit();
	}

	



}
