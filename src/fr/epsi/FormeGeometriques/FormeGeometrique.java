package fr.epsi.FormeGeometriques;

import java.text.DecimalFormat;

public abstract class FormeGeometrique {
    public String nom;

    public static final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double CalculPerimetre();

    public String toString() {
        return String.format("La forme %s qui est un(e) %s a pour perimetre %.2f\n", nom, this.getClass().getSimpleName().toLowerCase(), CalculPerimetre());
    }
}
