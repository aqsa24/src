package Inventory;

public class InventoryController {
	void add_inv1(String id,String Name,String qty,String price, String desc){
		Inventory1 inv= new Inventory1();
		inv.add_inv(id, Name, qty, price, desc);
		
	}
	void update_inv1( String id,String price,String qty){
		Inventory1 inv= new Inventory1();
		inv.update_inv(id, price, qty);
	}

}
