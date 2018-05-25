
public class Battle {
	Territory attacker;
	Territory defender;
	int att_units;
	boolean victory;
	public Battle(Territory attacker, Territory defender, int att_units, int def_units) {
		this.attacker=attacker;
		this.defender=defender;
		this.att_units=att_units;
	}
	
	//METHODS
	
	public boolean attPossible(Territory attacker, Territory defender, int att_units) {
		if (attacker.isNeighbor(defender) && attacker.getUnits()>att_units) {
			return true;
		}
		return false;
	}
	

}
