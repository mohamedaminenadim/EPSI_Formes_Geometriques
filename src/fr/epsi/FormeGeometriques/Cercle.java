package fr.epsi.FormeGeometriques;

public class Cercle extends FormeGeometrique {
	protected double rayon;

	public Cercle(double rayon) {
		this.rayon=rayon;
	}

	public Cercle(String nom,double rayon) {
		this(rayon);
		this.nom = nom;
	}

	@Override
	public double CalculPerimetre() {
		double perimetre = (rayon * 2) * Math.PI;
		return perimetre;
	}
}
