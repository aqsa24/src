package Patient;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Dbs.Database;

public class Disease {
	public int ID;

	public int Name;

	public String Description;

	public ArrayList Products;


	boolean DiseaseDelete(String id) {
		String query= "DELETE FROM `disease` WHERE ID="+id+"";
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

	boolean  DiseseAdd(String id,String name,String desc) {
		String query="INSERT INTO `disease`(`ID`,`Name`, `Description`) VALUES('"+id+"', '"+name+"','"+desc+"'  )";
		System.out.println(query);
		Database db= new Database ();
		boolean exc=false;
		
		try {
			exc=db.execute(query);
			JOptionPane.showMessageDialog(null, "Insert Disease");
		} catch (SQLException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
			
		}
		return  exc;
		
		
		
	}
		

	}


