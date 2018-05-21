
public class Player {
	static int id_counter=0;

	String name;
	int id;
	//constructor
	public Player(String name, int id) {
		this.id=++id_counter;
		this.name=name;
	}

	//GET / SET 
	public String getName() {
		return name;
	}
	public void setName(String new_name) {
		name=new_name;
	}


}
