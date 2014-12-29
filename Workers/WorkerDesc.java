package Workers;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Dbs.Database;

public class WorkerDesc {
	boolean add_Worker(String id,String dat,String B_Name,String pay, String post, String status,String Cont,String adr){
	
	String query="INSERT INTO `worker`(`ID`, `Name`, `Date of Joining`, `Pay`, `Post`, `Status`, `ContactNumber`,`Address`) VALUES('"+id+"','"+B_Name+"', '"+dat+"'  ,'"+pay+"',  '"+post+"','"+status+"' ,'"+Cont+"','"+adr+"'   )";
	System.out.println(query);
	Database db= new Database ();
	boolean exc=false;
	
	try {
		exc=db.execute(query);
		JOptionPane.showMessageDialog(null, "Insert Worker Record");
	} catch (SQLException e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
		
	}
	return  exc;
	
	
	
}
	boolean delete_worker( String id){
		String query= "DELETE FROM `worker` WHERE ID="+id+"";
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
	boolean update_worker(String id, String dat, String B_Name,String pay, String post, String status , String Cont, String adr){
		String query= "UPDATE `worker` SET  `Name`='"+B_Name+"',`Date of Joining` ='"+dat+"',`Pay`='"+pay+"', `Post`='"+post+"',`Status`='"+status+"',`ContactNumber`='"+Cont+"',`Address`='"+adr+"' where ID='"+id+"'";
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
	public ResultSet search(String id)
	{
		 Database p= new Database();
		String query="select * from worker where ID='"+id+"'";
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
