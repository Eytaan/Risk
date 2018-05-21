
public class Region {
	static int id_counter;
	
	int id;
	String name;
	boolean isgreatest;
	Territory[] territories;
	public Region(String name) {
		this.name=name;
		this.id=++id_counter;
		this.isgreatest=false;
	}
	
	//GET 
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public Territory[] getTerritories() {
		return territories;
	}
	
	//SET 
	public void setIsgreatest() {
		this.isgreatest=true;
	}
	
	public void setTerritories(Territory[] territories) {
		this.territories = territories;
	}
	
	
	// METHODS
	

}
