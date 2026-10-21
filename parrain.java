package sos;

public class parrain extends personne {
	private static int idp ;
	private int idparrain ;
	private int nbep ;
	private static int max = 100 ;
	private enfant mesenfant[] ;
	
	
	public parrain(String nom, String prenom, int age) {
		super(nom, prenom, age);
		this.idparrain = idp++;
		this.mesenfant=new enfant[max];
		this.nbep=0 ;
		
	}
	
	public void ajouterEnfant(enfant E) {
		if (nbep<max) {
			mesenfant[nbep]=E ;
			nbep+=1;
			
		}
		else {
			System.out.println("Le tableu plein");
		}
	}

	public int getNbep() {
		return nbep;
	}
	
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("IdParrain : "+idparrain);
		System.out.println("Nombre enfant parrain : "+nbep);
		for (int i =0 ; i<nbep ; i++) {
			mesenfant[i].afficherInfos();
		}
	}

	public enfant[] getMesenfant() {
		return mesenfant;
	}
	
	
	
	
}
