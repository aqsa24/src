package Billing;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import Db.Database;
public class Billing {
	
		

		

			

			boolean add_bill(String id,String Name,String bill,String rcv,String date){
				
				String query="INSERT INTO `billing`(`ID`, `PatientName`, `Bill`, `ReceivedBy`, `Date`)  VALUES ('"+id+"', '"+Name+"', '"+bill+"'  ,'"+rcv+"' , '"+date+"' )";
				System.out.println(query);
				Database db= new Database ();
				boolean exc=false;
				
				try {
					exc=db.execute(query);
				} catch (SQLException e) {
					// TODO Auto-generated catch bloc
					e.printStackTrace();
				}
				return  exc;
			}
			public boolean update_bill(String id, String Name, String bill, String rcv,String date)
			{
				String query =" UPDATE `billing` SET `PatientName`='"+Name+"',`Bill`='"+bill+"',`Date`='"+date+"',`ReceivedBy`= '"+rcv+"' WHERE ID = '"+id+"' " ;
				System.out.println(query);
				Database db1 = new Database();
				boolean exc = false;
				try{
					exc = db1.execute(query);
				}catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				return exc;
			}
			
			

}

