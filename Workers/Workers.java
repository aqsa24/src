package Workers;

public class Workers {
	public int ID;

	public String Name;

	private WorkerDesc workerDesc;

	private WorkerAttendence workerAttendence;

	public void AddWorker() {
		WorkerGui g= new WorkerGui();
		g.setVisible(true);
		setVisible(false);

	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void DeleteWorker() {
		WorkerDeleteGUI g= new WorkerDeleteGUI();
		g.setVisible(true);
		setVisible(false);

	}

	public void ViewDescription() {
		WorkerReteriveGUI g=new WorkerReteriveGUI();
		g.setVisible(true);
		setVisible(false);


	}

	public void CalculatePay() {

	}

	public void AddAttendence() {

	}

}
