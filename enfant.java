package sos;
public class enfant extends personne {
	private static int id = 1 ;
	private int idenfant ;
	private String classe ;
	public enfant(String nom, String prenom, int age) {
		super(nom , prenom , age);
		idenfant = id++ ;
	}
	public enfant(String nom, String prenom, int age, String classe ) {
		this(nom , prenom , age);
		this.classe = classe;
		
	}

	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("ID enfant : " + idenfant);
        System.out.println("Classe : " + classe);

	}
	public String getClasse() {
		return classe;
	}
	
	
	
	
	
	
	
	
	
	

}
