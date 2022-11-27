package fr.epsi.FormeGeometriques;

public class Triangle extends FormeGeometrique {
 protected double cote;

 
 @Override
 public double CalculPerimetre() {
	double perimetre = cote * 3;
	return perimetre;
}
 
 public Triangle(double cote) {
     this.cote = cote;
 }

public Triangle(String nom, double cote) {
	this(cote);
	this.nom=nom;
}
}
