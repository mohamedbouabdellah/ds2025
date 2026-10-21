package sos;
public class personne {
	private String nom ;
	private String prenom ;
	private int age ;
	
	
	public personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
    }


	public void setAge(int age) {
		if (age >=0) {
			this.age = age;
		}
		else {
			System.out.println("l'age doit etre positif");
		}
	}
	
	
	
	
	
	
	
}
