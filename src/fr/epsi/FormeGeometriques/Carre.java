package fr.epsi.FormeGeometriques;

public class Carre extends FormeGeometrique {
	protected double cote;

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	@Override
	public double CalculPerimetre() {
		return (cote * 4);
	}

	public Carre(String nom, double cote) {
		this.nom = nom;
		this.cote = cote;
	}
}
