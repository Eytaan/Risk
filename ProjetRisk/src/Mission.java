
public class Mission {
	static int id_counter=1;
	
	String duty;
	int id;
	//Constructor
	public Mission(String duty) {
		this.duty=duty;
		this.id=++id_counter;
	}
	////GET / SET
	public String getDuty() {
		return duty;
	}

}
