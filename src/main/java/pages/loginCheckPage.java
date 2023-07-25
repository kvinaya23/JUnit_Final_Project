package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BrowserFactory;

public class loginCheckPage extends BrowserFactory{
	
	public static String addNewItem = "Tech" + randomNumber( );
	
	
	@FindBy(how =How.XPATH ,using ="//input[@name='allbox' and type='checkbox']")WebElement TOGGLEALL_CHECKBOX;
	@FindBy(how =How.XPATH ,using ="//input[@name='data']")WebElement ADD_NEW_ITEM;
	@FindBy(how =How.XPATH,using ="//input[@value='Add']")WebElement CLICK_ON_ADD_BUTTON;
	@FindBy(how =How.XPATH,using ="[@id=\\\"todos-content\\\"]")List<WebElement> ElementCounts;
	@FindBy(xpath = "//*[contains(text(),'Tech')]")WebElement CHECK_BOX_BTN;
	@FindBy(xpath = "//input[@value='Remove']")WebElement REMOVE_BTN;
	
	


     public void loginPage() {
    	 
    	 PageFactory.initElements(driver, this);
    	 	 
     }
     
     public void addNewItem() {
    	 ADD_NEW_ITEM.sendKeys(addNewItem );
    	 ADD_NEW_ITEM.click();
     }
     
     public boolean  toggleAll(boolean toggleAll) {
    	 TOGGLEALL_CHECKBOX.isSelected();
     
  
	Assert.assertTrue("Toggle all checkbox is verified and passed" , toggleAll);
	  return true ;
	  
	
}
     
     
     
    public boolean deleteAllEntry() {
    	//ADD_NEW_ITEM.sendKeys(addNewItem);
    	//CLICK_ON_ADD_BUTTON.click();
		TOGGLEALL_CHECKBOX.click();
		
		REMOVE_BTN.click();
    	int delete = ElementCounts.size();	
    	delete =0;
    	return true;
    	
    	
    }
}

