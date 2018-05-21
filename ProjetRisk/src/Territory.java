
public class Territory {
	static int id_counter;

	int id; 
	int region_id;
	String name;
	String[] neighbors;
	double x_pos;
	double y_pos;
	double width;
	public Territory(String name) {
		this.id=++id_counter;
		this.name=name;
	}

	//GET 
	public String getName() {
		return name;
	}

	public String[] getNeighbors() {
		return neighbors;
	}


	//SET 

	public void setNeighbors(String[] neighbors) {
		this.neighbors=neighbors;
	}
	
	public void setPosition(double x, double y, double width) {
		this.x_pos=x;
		this.y_pos=y;
		this.width=width;
	}


	//METHODS
	public boolean isNeighbor(Territory Territory2) {
		String [] neighbors_territory1=this.getNeighbors();
		String name_territory2 = Territory2.getName();
		for (int i=0; i<neighbors_territory1.length; i++) {
			if (neighbors_territory1[i] == name_territory2) {
				return true;
			}
		}
		return false;
	}
	

}
