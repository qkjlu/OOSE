package fr.polymontp.mas.entreprise;

public class EmployeHoraire extends Employe {
	private int hN;
	private int hS;
	private float t;
	
	public EmployeHoraire(String nom,int hN, int hS, int t) {
		super(nom);
		this.hN = hN;
		this.hS = hS;
		this.t = t;
	}

	public EmployeHoraire(String nom) {
		super(nom);
	}

	public void setInfosSalaire(int hN, int hS, int t) {
		this.hN = hN;
		this.hS = hS;
		this.t = t;
	}
	@Override
	public float getSalaire() {
		return getTauxHoraire()*this.hN + (1+this.t)*this.hS*getTauxHoraire();
	}
	
	public float getTauxHoraire() {
		return (float) 9.88;
	}

}
