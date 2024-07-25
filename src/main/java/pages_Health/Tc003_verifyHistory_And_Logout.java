package pages_Health;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_HealthCare.Utils_class;

public class Tc003_verifyHistory_And_Logout extends Utils_class{
	
	public static Tc003_verifyHistory_And_Logout history;
	
	
	@FindBy(partialLinkText="Go to Homepage")
	WebElement HPButton;
	
	@FindBy(xpath="//i[@class='fa fa-bars']")
	WebElement Menu;
	
	@FindBy(partialLinkText="History")
	WebElement Detail;
	
	
	@FindBy(partialLinkText="Logout")
	WebElement LTButton;
	
	
	
	
	
	 public  Tc003_verifyHistory_And_Logout() {
 		// TODO Auto-generated constructor stub
 		
 		PageFactory.initElements(driver, this);
 	}
	 
	 public void history() throws InterruptedException {
		 
		 HPButton.click();
		 
		 Thread.sleep(2000);
		 
		 Menu.click();
		 
		 Detail.click();
		 Thread.sleep(1000);
		 
		 Menu.click();
		 
		 LTButton.click();
		 
	 }
	 
	 public static Tc003_verifyHistory_And_Logout VH()   {
 		history=new Tc003_verifyHistory_And_Logout ();
 	return history ;
 		
 	}

}
