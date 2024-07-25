package pages_Health;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils_HealthCare.Utils_class;

public class Tc002_MakeAppointment  extends Utils_class{
	
        public static  Tc002_MakeAppointment Makeapp; 
        
        
        @FindBy(name="facility")
        WebElement Facility;
        
     //   Select DROPDOWN =new Select(Facility);
        
        
        
      	@FindBy(id="chk_hospotal_readmission")
      	WebElement checkbox;
      	
      	@FindBy(id="radio_program_medicaid")
      	WebElement Ratiobutton;
      	
      	
      	@FindBy(id="txt_visit_date")
      	WebElement Date;
       
      	
    	@FindBy(id="txt_comment")
      	WebElement Comments;
        
    	
    	@FindBy(id="btn-book-appointment")
    	WebElement BookAppoint;
		
        public  Tc002_MakeAppointment () {
    		// TODO Auto-generated constructor stub
    		
    		PageFactory.initElements(driver, this);
    	}
        
        
        public void makeappointment() throws InterruptedException{
        	
        	
        	Facility.click();
        	//Thread.sleep(2000);
        	
        	//DROPDOWN.selectByValue("Hongkong CURA Healthcare Center");
        	
        	checkbox.click();
        	Thread.sleep(3000);
        	
        	Ratiobutton.click();
        	
        	Date.sendKeys("26/07/2024");
        	
        	Thread.sleep(2000);
        	
        	Comments.sendKeys("It is very Emerengency Situation");
        	
        	BookAppoint.click();
        	
			
			
	
		}
        
        
        
        
        public static Tc002_MakeAppointment  Appointment() {
    		Makeapp=new Tc002_MakeAppointment ();
    	return Makeapp ;
    		
    	}
    	
	
	}

