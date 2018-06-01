import edu.princeton.cs.introcs.StdDraw;


public class Main {

	public static void main(String[] args) {
		//REGIONS
		Region NorthAmerica = new Region("North America");
		Region SouthAmerica = new Region("South America");
		Region Africa = new Region("Africa");
		Region Europe = new Region("Europe");
		Region Asia = new Region("Asia");
		Region Australia = new Region("Australia");
		Asia.setIsgreatest();
		Region[] RegionTab = new Region[] {NorthAmerica, SouthAmerica, Africa, Europe, Asia, Australia};


		//TERRITORIES

		//North America
		Territory Alaska = new Territory("Alaska" );
		Territory NorthwestTerritory= new Territory("Northwest Territory");
		Territory Alberta = new Territory("Alberta");
		Territory WesternUnitedStates = new Territory("Western United States");
		Territory CentralAmerica = new Territory("Central America");
		Territory EasternUnitedStates = new Territory("Eastern United States");
		Territory Ontario = new Territory("Ontario");
		Territory Quebec = new Territory("Quebec");
		Territory Greenland = new Territory("Greenland");


		//South America
		Territory Venezuela = new Territory("Venezuela");
		Territory Brazil = new Territory("Brazil");
		Territory Peru = new Territory("Peru");
		Territory Argentina = new Territory("Argentina");

		//Africa
		Territory NorthAfrica = new Territory("North Africa");
		Territory Egypt = new Territory("Egypt");
		Territory EastAfrica = new Territory("East Africa");
		Territory Congo = new Territory("Congo");
		Territory SouthAfrica = new Territory("South Africa");
		Territory Madagascar = new Territory("Madagascar");

		//Europe
		Territory WesternEurope = new Territory("Western Europe");
		Territory NorthernEurope = new Territory("Northern Europe");
		Territory SouthernEurope = new Territory("Southern Europe");
		Territory Ukraine = new Territory("Ukraine");
		Territory Scandinavia = new Territory("Scandinavia");
		Territory GreatBritain = new Territory("Great Britain");
		Territory Iceland = new Territory("Iceland");

		//Asia
		Territory MiddleEast = new Territory("Middle East");
		Territory Afghanistan = new Territory("Afghanistan");
		Territory Ural = new Territory("Ural");
		Territory Siberia = new Territory("Siberia");
		Territory Yakutsk = new Territory("Yakutsk"); 
		Territory Irkutsk = new Territory("Irkutsk");
		Territory Kamchatka = new Territory("Kamchatka");
		Territory Japan = new Territory("Japan");
		Territory Mongolia = new Territory("Mongolia");
		Territory China = new Territory("China");
		Territory India = new Territory("India");
		Territory Siam = new Territory("Siam");

		//Australia
		Territory Indonesia = new Territory("Indonesia");
		Territory NewGuinea = new Territory("New Guinea");
		Territory EasternAustralia = new Territory("Eastern Australia");
		Territory WesternAustralia = new Territory("Western Australia");



		//NEIGHBORS

		//North America
		String[] Alaska_neighbors = new String[] { "Northwest Territory" , "Alberta" ,"Kamchatka"};
		String[] NorthwestTerritory_neighbors = new String[] {"Alaska", "Alberta", "Ontario", "Greenland"};
		String[] Alberta_neighbors = new String[] {"Alaska", "Northwest Territory", "Ontario", "Western United States"};
		String[] Ontario_neighbors = new String[] {"Alberta", "Northwest Territory", "Greenland", "Quebec", "Eastern United States", "Western United States"};
		String[] Quebec_neighbors = new String[] {"Ontario", "Eastern United States", "Greenland"};
		String[] Greenland_neighbors = new String[] {"Northwest Territory", "Ontario", "Quebec", "Iceland"};
		String[] WesternUnitedStates_neighbors = new String[] {"Alberta", "Ontario", "Eastern United States"};
		String[] EasternUnitedStates_neighbors = new String[] {"Quebec", "Ontario", "Western United States", "Central America"};
		String[] CentralAmerica_neighbors = new String[] {"Western United States", "Eastern United States", "Venezuela"};

		//South America
		String[] Venezuela_neighbors = new String[] {"Central America", "Peru", "Brazil"};	
		String[] Peru_neighbors = new String[] {"Venezuela", "Brazil", "Argentina"};
		String[] Brazil_neighbors = new String[] {"Venezuela", "Peru", "Argentina", "North Africa"};
		String[] Argentina_neighbors = new String[] {"Peru", "Brazil"};

		//Africa
		String[] NorthAfrica_neighbors = new String[] {"Brazil", "Egypt", "East Africa", "Congo", "Western Europe", "Southern Europe"};
		String[] Egypt_neighbors = new String[] {"Southern Europe", "North Africa", "Middle East", "East Africa"};
		String[] Congo_neighbors = new String[] {"North Africa", "East Africa", "South Africa"};
		String[] EastAfrica_neighbors = new String[] {"Egypt", "Middle East", "North Africa", "Congo", "South Africa", "Madagascar"};
		String[] SouthAfrica_neighbors = new String[] {"Congo", "East Africa", "Madagascar"};
		String[] Madagascar_neighbors = new String[] {"South Africa", "East Africa"};

		//Europe
		String[] WesternEurope_neighbors = new String[] {"North Africa", "Northern Europe", "Southern Europe", "Great Britain", };
		String[] SouthernEurope_neighbors = new String[] {"North Africa", "Western Europe", "Northern Europe", "Ukraine", "Middle East", "Egypt"};
		String[] NorthernEurope_neighbors = new String[] {"Southern Europe", "Western Europe", "Great Britain", "Ukraine", "Scandinavia"};
		String[] GreatBritain_neighbors = new String[] {"Western Europe", "Northern Europe", "Scandinavia", "Iceland"};
		String[] Iceland_neighbors = new String[] {"Greenland", "Scandinavia", "Great Britain"};
		String[] Scandinavia_neighbors = new String[] {"Iceland", "Great Britain", "Northern Europe", "Ukraine"};
		String[] Ukraine_neighbors = new String[] {"Scandinavia", "Northern Europe", "Southern Europe", "Middle East", "Afghanistan", "Ural"};

		//Asia
		String[] Ural_neighbors = new String[] {"Ukraine", "Afghanistan", "China", "Siberia"};
		String[] Afghanistan_neighbors = new String[] {"Ukraine", "Ural", "China", "India", "Middle East"};
		String[] MiddleEast_neighbors = new String[] {"Egypt", "East Africa", "India", "Afghanistan", "Ukraine", "Southern Europe"};
		String[] Siberia_neighbors = new String[] {"Ural", "China", "Mongolia", "Irkutsk", "Yakutsk"};
		String[] China_neighbors = new String[] {"Siberia", "Ural", "Afghanistan", "India", "Siam", "Mongolia"};
		String[] India_neighbors = new String[] {"Middle East", "Afghanistan", "China", "Siam"};
		String[] Siam_neighbors = new String[] {"India", "China", "Indonesia"};
		String[] Mongolia_neighbors = new String[] {"China", "Siberia", "Irkutsk", "Kamchatka", "Japan"};
		String[] Irkutsk_neighbors = new String[] {"Siberia", "Mongolia", "Kamchatka", "Yakutsk"};
		String[] Yakutsk_neighbors = new String[] {"Irkutsk", "Siberia", "Kamchatka"};
		String[] Kamchatka_neighbors = new String[] {"Yakustk", "Irkutsk", "Mongolia", "Japan", "Alaska"};
		String[] Japan_neighbors = new String[] {"Kamchatka", "Mongolia"};

		//Australia
		String[] Indonesia_neighbors = new String[] {"Siam", "New Guinea", "Western Australia"};
		String[] NewGuinea_neighbors = new String[] {"Indonesia", "Western Australia", "Eastern Australia"};
		String[] EasternAustralia_neighbors = new String[] {"Western Australia", "New Guinea"};
		String[] WesternAustralia_neighbors = new String[] {"Eastern Australia", "New Guinea", "Indonesia"};


		//SET TERRITORIES IN REGIONS

		Territory[] TerritoriesOfNorthAmerica = new Territory[] {Alaska, NorthwestTerritory, Greenland, Alberta, Ontario, Quebec, WesternUnitedStates, EasternUnitedStates, CentralAmerica};
		Territory[] TerritoriesOfSouthAmerica = new Territory[] {Venezuela, Brazil, Peru , Argentina};
		Territory[] TerritoriesOfAfrica = new Territory[] {NorthAfrica, Egypt, Congo, EastAfrica, SouthAfrica, Madagascar};
		Territory[] TerritoriesOfEurope = new Territory[] {WesternEurope, SouthernEurope, NorthernEurope, GreatBritain, Iceland, Scandinavia, Ukraine};
		Territory[] TerritoriesOfAsia = new Territory[] {MiddleEast, Afghanistan, Ural, Siberia, Yakutsk, Irkutsk, Kamchatka, Japan, Mongolia, China, Siam, India};
		Territory[] TerritoriesOfAustralia = new Territory[] {Indonesia, NewGuinea, EasternAustralia, WesternAustralia};

		NorthAmerica.setTerritories(TerritoriesOfNorthAmerica);
		SouthAmerica.setTerritories(TerritoriesOfSouthAmerica);
		Africa.setTerritories(TerritoriesOfAfrica);
		Europe.setTerritories(TerritoriesOfEurope);
		Asia.setTerritories(TerritoriesOfAsia);
		Australia.setTerritories(TerritoriesOfAustralia);

		//SET NEIGHBORS
		Alaska.setNeighbors(Alaska_neighbors);
		NorthwestTerritory.setNeighbors(NorthwestTerritory_neighbors);
		Alberta.setNeighbors(Alberta_neighbors);
		Ontario.setNeighbors(Ontario_neighbors);
		Quebec.setNeighbors(Quebec_neighbors);
		Greenland.setNeighbors(Greenland_neighbors);
		WesternUnitedStates.setNeighbors(WesternUnitedStates_neighbors);
		EasternUnitedStates.setNeighbors(EasternUnitedStates_neighbors);
		CentralAmerica.setNeighbors(CentralAmerica_neighbors);

		Venezuela.setNeighbors(Venezuela_neighbors);
		Peru.setNeighbors(Peru_neighbors);
		Brazil.setNeighbors(Brazil_neighbors);
		Argentina.setNeighbors(Argentina_neighbors);

		NorthAfrica.setNeighbors(NorthAfrica_neighbors);
		EastAfrica.setNeighbors(EastAfrica_neighbors);
		SouthAfrica.setNeighbors(SouthAfrica_neighbors);
		Congo.setNeighbors(Congo_neighbors);
		Egypt.setNeighbors(Egypt_neighbors);
		Madagascar.setNeighbors(Madagascar_neighbors);

		WesternEurope.setNeighbors(WesternEurope_neighbors);
		SouthernEurope.setNeighbors(SouthernEurope_neighbors);
		NorthernEurope.setNeighbors(NorthernEurope_neighbors);
		Ukraine.setNeighbors(Ukraine_neighbors);
		Scandinavia.setNeighbors(Scandinavia_neighbors);
		GreatBritain.setNeighbors(GreatBritain_neighbors);
		Iceland.setNeighbors(Iceland_neighbors);

		MiddleEast.setNeighbors(MiddleEast_neighbors);
		Afghanistan.setNeighbors(Afghanistan_neighbors);
		Siberia.setNeighbors(Siberia_neighbors);		
		Ural.setNeighbors(Ural_neighbors);
		China.setNeighbors(China_neighbors);
		India.setNeighbors(India_neighbors);
		Irkutsk.setNeighbors(Irkutsk_neighbors);
		Yakutsk.setNeighbors(Yakutsk_neighbors);
		Kamchatka.setNeighbors(Kamchatka_neighbors);
		Mongolia.setNeighbors(Mongolia_neighbors);
		Japan.setNeighbors(Japan_neighbors);
		Siam.setNeighbors(Siam_neighbors);

		Indonesia.setNeighbors(Indonesia_neighbors);
		NewGuinea.setNeighbors(NewGuinea_neighbors);
		EasternAustralia.setNeighbors(EasternAustralia_neighbors);
		WesternAustralia.setNeighbors(WesternAustralia_neighbors);
		
		//VIEWS

		int x = 800;
		int y = 745; // 497
		StdDraw.setXscale(0,x); // 248.5 
		StdDraw.setYscale(0,y);
		StdDraw.setCanvasSize(x,y);
		StdDraw.picture(0.5, 0.66, "ProjetRisk/Blank Risk.png");
		
		Alaska.setPosition(0.06625,0.8644295302013423,0.02);
		NorthwestTerritory.setPosition(0.16, 0.8644295302013423,0.02);
		Alberta.setPosition(0.17125,0.8040268456375839,0.02);
		WesternUnitedStates.setPosition(0.16375,0.7463087248322148,0.02);
		CentralAmerica.setPosition(0.18875,0.6657718120805369,0.02);
		EasternUnitedStates.setPosition(0.25875 , 0.7328859060402684,0.02);
		Ontario.setPosition(0.23875 , 0.8013422818791947,0.02);
		Quebec.setPosition(0.3125 ,0.8040268456375839,0.02);
		Greenland.setPosition( 0.38375 , 0.9033557046979865,0.02);
		
		Venezuela.setPosition(0.21875 , 0.6013422818791947,0.02);
		Brazil.setPosition(0.30375 ,0.52751677852349,0.02);
		Peru.setPosition(0.20125,0.512751677852349,0.02);
		Argentina.setPosition(0.2425,0.4134228187919463,0.02);
		
		NorthAfrica.setPosition(0.49375 , 0.4,0.02);
		Egypt.setPosition(0.505 ,0.6255033557046981,0.02);
		EastAfrica.setPosition(0.57375, 0.5248322147651007,0.02);
		Congo.setPosition(0.4925 , 0.49261744966442955,0.02);
		SouthAfrica.setPosition(0.43375, 0.5825503355704698,0.02);
		Madagascar.setPosition(0.58625 , 0.4120805369127517,0.02);
		
		WesternEurope.setPosition(0.4225 , 0.7114093959731543,0.02);
		NorthernEurope.setPosition(0.48,0.763758389261745,0.02);
		SouthernEurope.setPosition(0.4925 , 0.7087248322147651,0.02);
		Ukraine.setPosition(0.57375 , 0.7973154362416107,0.02);
		Scandinavia.setPosition(0.4775 , 0.8483221476510068,0.02);
		GreatBritain.setPosition(0.41625 , 0.7718120805369127,0.02);
		Iceland.setPosition(0.4225, 0.8362416107382551,0.02);
		
		MiddleEast.setPosition(0.58625 , 0.6375838926174497,0.02);
		Afghanistan.setPosition(0.6425 , 0.7288590604026846,0.02);
		Ural.setPosition(0.66875 , 0.8187919463087249,0.02);
		Siberia.setPosition(0.73375, 0.8416107382550335,0.02);
		Yakutsk.setPosition(0.82625, 0.8577181208053691,0.02);
		Irkutsk.setPosition(0.79375, 0.7919463087248322,0.02);
		Kamchatka.setPosition(0.93125 , 0.8429530201342281,0.02);
		Japan.setPosition(0.88375 ,0.7154362416107383,0.02);
		Mongolia.setPosition(0.81625 , 0.7355704697986577,0.02);
		China.setPosition(0.7575, 0.6778523489932886,0.02);
		India.setPosition(0.6875 , 0.5986577181208054,0.02);
		Siam.setPosition(0.77375 , 0.6,0.02);
		
		
		Indonesia.setPosition(0.78875 , 0.5302013422818792,0.02);
		NewGuinea.setPosition(0.91125, 0.512751677852349,0.02);
		EasternAustralia.setPosition(0.89125 , 0.425503355704698,0.02);
		WesternAustralia.setPosition(0.78, 0.40402684563758384,0.02);
		
		System.out.println("bite");
		
	}

}
