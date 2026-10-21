package sos;
public class ProgrammeParrainage {
	public static void main(String[] args) {
		parrain[] parrains = new parrain[10];
		parrains[0] = new parrain("Ali", "Ben Ali", 40);
		parrains[1] = new parrain("Salah", "Ben Salah", 35);
		parrains[2] = new parrainMensuel("Tounes", "Ben Tounes", 45, 100.0);
		
		enfant[] enfants = new enfant[1025];
		enfants[0] = new enfant("Farah", "ben Farah", 10, " quatrième année ");
		enfants[1] = new enfant("Amel", "ben Amel", 12, "Sixième année");
		enfants[2] = new enfant("Fedy", "Ben Fedy", 11, "Sixième année");
		enfants[3] = new enfant("Sarra", "Ben Sarra", 9, "Troisième année");
		enfants[4] = new enfant("aaaaa", "Ben Fedy", 11, "Sixième année");
		
		parrains[0].ajouterEnfant(enfants[0]);
		
		parrains[2].ajouterEnfant(enfants[1]);
		parrains[2].ajouterEnfant(enfants[2]);
		
		int total=0;
		for (int i =0 ; i<parrains.length ; i++) {
			if (parrains[i]!=null) {
				total+=parrains[i].getNbep();
			}
		}
		System.out.println("le nombre totale : "+total);
		
		for (int i =0 ; i<parrains.length ; i++) {
			if (parrains[i]!=null ) {
				enfant[] e = parrains[i].getMesenfant();
				for (int j= 0 ; j<parrains[i].getNbep() ; j++) {
					if ((e[j].getClasse()).equals("Sixième année")) {
						e[j].afficherInfos();
					}
				}
			}
		}
		
		double totalm =0 ;
		
		for (int i =0 ; i<parrains.length ; i++) {
			if (parrains[i]!=null ) {
				if(parrains[i] instanceof parrainMensuel) {
					totalm+=((parrainMensuel) parrains[i]).calculerVirementTotal() ;
				}
			}
		}
		System.out.println("le nombre totale : "+totalm);

		
	
	}
}
