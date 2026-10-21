package sos;

public class parrainMensuel extends parrain {
	private double vm ;

	public parrainMensuel(String nom, String prenom, int age , double vm) {
		super(nom, prenom, age);
		this.vm = vm;

	}
	
	public double calculerVirementTotal() {
		return vm* super.getNbep();
	}

	public double getVm() {
		return vm;
	}
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("Le montant Total :"+this.calculerVirementTotal());
	}
	
	
	
}
