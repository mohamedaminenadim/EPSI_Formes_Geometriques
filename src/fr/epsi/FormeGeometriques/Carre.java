package fr.epsi.FormeGeometriques;

public class Carre extends FormeGeometrique {
	protected double cote;
 
	@Override
	public double CalculPerimetre() {
		double perimetre = cote * 4;
		return perimetre;
	}

	public Carre(String nom, double cote) {
		this.nom = nom;
		this.cote = cote;
	}
}
