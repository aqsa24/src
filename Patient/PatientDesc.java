package Patient;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Dbs.Database;
public class PatientDesc {
	

	

		

		boolean add_buyer(String id,String dat,String B_Name,String Age_s,String Disease_s, String Patient_history, String Weight_s,String Height_s){
			
			String query="INSERT INTO `record`(`ID`,`Date`, `Name`, `Age`, `Disease`, `PatientHistory`, `Weight`, `Height`) VALUES('"+id+"', '"+dat+"','"+B_Name+"', '"+Age_s+"'  ,'"+Disease_s+"',  '"+Patient_history+"','"+Weight_s+"' ,'"+Height_s+"'   )";
			System.out.println(query);
			Database db= new Database ();
			boolean exc=false;
			
			try {
				exc=db.execute(query);
				JOptionPane.showMessageDialog(null, "Insert Record");
			} catch (SQLException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
				
			}
			return  exc;
			
			
			
		}
		boolean update_buyer( String id,String Name_s,String Age_s,String weight,String height,String Disease, String Patient_history,String date){
			String query= "UPDATE `record` SET  `Name`='"+Name_s+"',`Age` ='"+Age_s+"',`Disease`='"+Disease+"', `PatientHistory`='"+Patient_history+"',`Date`='"+date+"',`Weight`='"+weight+"',`Height`='"+height+"' where ID='"+id+"'";
			System.out.println(query);
			Database db= new Database ();
			boolean exc=false;
			
			try {
				exc=db.execute(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return  exc;
		}
		boolean delete_patient( String id){
			String query= "DELETE FROM `record` WHERE ID="+id+"";
			System.out.println(query);
			Database db= new Database ();
			boolean exc=false;
			
			try {
				exc=db.execute(query);
				JOptionPane.showMessageDialog(null,"Deleted");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}
			return  exc;
		}
		public ResultSet search(String id)
		{
			 Database p= new Database();
			String query="select * from record where ID='"+id+"'";
			ResultSet rs=null;
			try{
				rs=p.execute1(query);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return rs;
		}

}





