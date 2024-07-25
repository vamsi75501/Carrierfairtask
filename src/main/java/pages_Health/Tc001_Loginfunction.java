package pages_Health;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_HealthCare.Utils_class;

public class Tc001_Loginfunction extends Utils_class {
	
	public static Tc001_Loginfunction loginobj;
	
	@FindBy(id="menu-toggle")
	WebElement Button;
	
	@FindBy(partialLinkText="Login")
	WebElement Login;
	
	
	@FindBy(id="txt-username")
	WebElement Username;
	
    
	@FindBy(id="txt-password")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement LoginButton;
	
	
	public Tc001_Loginfunction() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginfun() throws InterruptedException {
		
		Button.click();
		Login.click();
		Thread.sleep(2000);
		
		Username.sendKeys("John Doe");
		Password.sendKeys("ThisIsNotAPassword");
		
		Thread.sleep(1000);
		
		LoginButton.click();
		
	}
	
	
	public static Tc001_Loginfunction log() {
		loginobj=new Tc001_Loginfunction();
	return loginobj;
		
	}
	
	
	
	
	
	
	
	
	
}
