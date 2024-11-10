package Com.Amazon.Homepage;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import com.Amazon.Seleniumbase.Base;
import com.Amazon.Seleniumbase.Browser;
import com.Amazon.Seleniumbase.Locators;

public class BaseTest extends Base {

	@Test
	void searchamazon() throws InterruptedException {

		setup(Browser.CHROME,"https://www.amazon.in/");
		String getTitle = GetTitle();
		SoftAssert asserti=new SoftAssert();
		asserti.assertEquals(getTitle, GetTitle());
		asserti.assertAll();

		System.out.println("Title of the current webpage is:"+getTitle);

		String Currenturl = Geturl();

		System.out.println("Current url of the webpage is:"+Currenturl);

		//WebElement searchbox = Element("id", "twotabsearchtextbox");
		//type(Element("id", "twotabsearchtextbox"), "Hp Laptop");  

		type( Element(Locators.id, "twotabsearchtextbox"),"Hp Laptop",Keys.ENTER);
		Thread.sleep(3000);
		quit();


	}
}
