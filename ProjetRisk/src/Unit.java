
public class Unit {
	static int id_counter=1;
	
	int id;
	int id_owner;
	int cost;
	int min_strength;
	int att_priority;
	int def_priority;
	int mp; // movement points
	public Unit(int cost, int min_strength, int att_priority, int def_priority, int mp) {
		this.id=++id_counter;
		this.cost=cost;
		this.min_strength=min_strength;
		this.att_priority=att_priority;
		this.def_priority=def_priority;
		this.mp=mp;
		
	}
	
	//GET 
	
	
	//SET 
	public void setIdOwner(int id_owner) {
		this.id_owner = id_owner;
	}
	

}
