package test_caseHealtCare;

import org.testng.annotations.Test;

import base_Class_Adac.Baseclass;
import pages_Health.Tc001_Loginfunction;
import pages_Health.Tc002_MakeAppointment;
import pages_Health.Tc003_verifyHistory_And_Logout;



public class TestCase_Class extends  Baseclass{
	
	@Test
	public void Homepageverfication() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//Tc_001 LoginFunction
		Tc001_Loginfunction.log().loginfun();
		
		System.out.println("Lgoin Sucessfull");
		
		//Tc_002 Make appointment
		
		Tc002_MakeAppointment.Appointment().makeappointment();
		
		System.out.println("Appointment Book");
		
		
		Tc003_verifyHistory_And_Logout.VH().history();
		
		
		System.out.println("Historyviewd");
		
		System.out.println("Successfully Logout");
	}

}
