package Resceptionist;

import Billing.billinggui1;
import Inventory.InventoryGUI;
import Patient.PatientGUI;
import Workers.WorkerDeleteGUI;
import Workers.WorkerGui;
import Workers.Workers;

public class Resceptionist {
	public void UpdatePatient() {
		PatientGUI b=new PatientGUI();
		b.setVisible(true);
		setVisible(false);

	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void CalculateBill() {
		
		billinggui1 b=new billinggui1();
		b.setVisible(true);
		setVisible(false);
	}
	public void ReteriveBill() {
		billinggui1 b=new billinggui1();
		b.setVisible(true);
		setVisible(false);
	}
	public void AddProducts() {
		InventoryGUI b=new InventoryGUI();
		b.setVisible(true);
		setVisible(false);

	}

	public void MakeAppointment() {

	}

	public void ReteriveProducts() {

	}

	public void DeleteAppointment() {

	}

	public void ViewAppointment() {

	}

	public void CheckAttendence() {

	}

	public void AddAttendence() {

	}

	public void AddWorker() {
		Workers g= new Workers();
		g.AddWorker();
	}

	public void DeleteWorker() {
		Workers g= new Workers();
		g.DeleteWorker();

	}

	public void AddSupplier() {

	}

	public void CheckSupplierlist() {

	}

	public void CheckProductSupplied() {

	}


}
