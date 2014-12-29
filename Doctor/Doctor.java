package Doctor;

import Billing.billinggui1;
import Inventory.InventoryGUI;
import Patient.PatientReteriveGUI;


public class Doctor {
	
	

	public void SeeAppointment() {

	}

	public void CheckBills() {
		billinggui1 b=new billinggui1();
		b.setVisible(true);
		setVisible(false);

	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void CheckProducts() {

	}

	public void UpdateCV() {

	}

	public void CheckSupplierList() {

	}

	public void CheckPatientDesc() {
		
		PatientReteriveGUI b=new PatientReteriveGUI();
		b.setVisible(true);
		setVisible(false);
	}

	public void AddPrescription() {
		Prescription p= new Prescription();
		p.AddPrescription();

	}
}
