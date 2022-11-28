package fr.epsi.FormeGeometriques;

/**
 * In order to simplify the task in hand, we decided to only use
 * the generic case of an equilateral triangle
 */
public class Triangle extends FormeGeometrique {
    protected double cote;

 
    @Override
    public double CalculPerimetre() {
        return cote * 3;
    }

    public Triangle(double cote) {
        this.cote = cote;
    }

    public Triangle(String nom, double cote) {
        this(cote);
        this.nom=nom;
}
}
