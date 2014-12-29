package Inventory;
import java.sql.SQLException;
import dbb.Database;
public class Inventory1 {
	
	

		

			

			boolean add_inv(String id,String Name,String qty,String price, String desc){
				
				String query="INSERT INTO `product`(`Id`, `Name`, `Quantity`, `Price`, `Description`) VALUES('"+id+"', '"+Name+"', '"+qty+"'  ,'"+price+"',  '"+desc+"'   )";
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
			boolean update_inv( String id,String price,String qty){
				String query= "UPDATE `product` SET  `Quantity`='"+qty+"',`Price` ='"+price+"' where Id="+id+"" ;
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
			

	}





