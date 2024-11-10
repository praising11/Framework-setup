package com.Amazon.Seleniumbase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	
/**
 * This  method will launch  chrome browser with given Url
 * @author praising
 * @param Url
 * @exception NullpointerException
 */
	
	void setup(String Url);
	
	/**
	 * This  method will launch chrome browser with the given url
	 * @author praising
	 * @param Browser
	 * @param Url
	 * @exception
	 */
	
	void setup(Browser Browsername,String Url);
	
	
	/**
	 * This Method is used to find any Element  with in the package.
	 * @param type - Element type eg  -id,name ,classname,Tagname,linktext,partiallinktext,Css,Xpath
	 * @param value -Element value
	 * @return WebElement
	 */
	
	WebElement Element(Locators type,String value);
	
	/**
	 * This Method is used to handle the window
	 * @param i
	 */
	void windowhandling(int i);
	
	
	/**
	 * This method is used to select any value in dropdown
	 * @param ele
	 * @param value
	 */
	void selectvalue(WebElement ele,String value);
	
	
	/**
	 * This method is used to select any text in dropdown
	 * @param ele
	 * @param text
	 */
	void selecttext(WebElement ele,String text);
	
	
	/**
	 * This method is used to select any value  by indexin dropdown
	 * @param ele
	 * @param position
	 */
	void selectindex(WebElement ele, int position);
	
	
	
	void click(WebElement ele);
	
	void type(WebElement ele,String testdata);
	
	void appendtext(WebElement ele);
	
	public String GetTitle();
	
	public String Geturl();
	
	
	boolean isdisplayed(WebElement ele);
	
	boolean isEnabled(WebElement ele);
	
	boolean isselected(WebElement ele);
	 
	/**
	 * This  Method will close the current focused browser
	 */
	void close();
	/**
	 * This Method  Will close the all the browser .
	 */
	void quit();

	
	void type(WebElement ele, String testdata, Keys key);
	
	
	

}
