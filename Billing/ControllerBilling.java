package Billing;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ControllerBilling {
	void add_bill1(String id,String Name,String bill,String rcv,String date)
	{
		Billing b= new Billing();
		b.add_bill(id,Name,bill,rcv,date);
		
	}
	public void update_bill1(String id, String Name, String bill, String rcv,String date){
		
		Billing b= new Billing();
		b.update_bill(id,Name,bill,rcv,date);
	
	}

}
