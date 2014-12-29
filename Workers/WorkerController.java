package Workers;

public class WorkerController {
	void add_Worker1(String id,String dat,String B_Name,String pay, String post, String status,String Cont,String adr){
		WorkerDesc p=new WorkerDesc();
		p.add_Worker(id, dat, B_Name, pay, post, status, Cont,adr);
		
	}
	void delete_worker( String id)
	{
		WorkerDesc p=new WorkerDesc();
		p.delete_worker(id);
		
	}
	public void update_Worker1(String id, String dat, String B_Name,
			String pay, String post, String status , String Cont, String adr) {
		WorkerDesc p=new WorkerDesc();
		p.update_worker(id, dat, B_Name, pay, post, status, Cont, adr);
		
	}
	
	
}
