package test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pages.loginCheckPage;
import util.BrowserFactory;

public class LoginPageTest extends BrowserFactory {

	loginCheckPage logincheckpage;

	
	@Before
	public void initialization() {

		init();
	}
	
	@Test
	public void addNewItemTest() {
		
		logincheckpage.addNewItem();
	}
	@Test
	public void toggleAllCheckBoxTest() {
		
	//	logincheckpage.toggleAll();
	//	return;
	
		
	}
	@Test
	public void validateListedItemsAreDeletedWhenToggleOn() {
		
		Assert.assertTrue(logincheckpage.deleteAllEntry());
		System.out.println("Deleted All Entries Successfully");
	}
	
	public static void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
	

}
