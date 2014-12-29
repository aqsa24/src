package Patient;

import java.sql.ResultSet;

public class PatientController {
	void add_buyer1(String id,String dat,String B_Name,String Age_s,String Disease_s, String Patient_history, String Weight_s,String Height_s){
		PatientDesc p= new PatientDesc();
		p.add_buyer(id,dat,B_Name,Age_s,Disease_s, Patient_history, Weight_s,Height_s);
		
	}
	void delete_patient1( String id){
		PatientDesc p= new PatientDesc();
		p.delete_patient(id);
		
	}
	public void search()
	{
		
	}
}
