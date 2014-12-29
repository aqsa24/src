package Patient;

public class DiseaseController {

	public void add_disease1(String id, String name, String desc) {
		
		Disease d= new Disease();
		d.DiseseAdd(id,name,desc);
		
	}

	public void delete_disease(String id) {
		Disease d= new Disease();
		d.DiseaseDelete(id);
		
		
	}

}
