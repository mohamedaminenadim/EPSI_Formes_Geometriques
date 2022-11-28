package fr.epsi.FormeGeometriques;

public abstract class FormeGeometrique {
    public String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double CalculPerimetre();

    public String toString() {
        return "La forme " + nom + " qui est un(e) " + this.getClass().getSimpleName().toLowerCase() + " a pour perimetre "+ CalculPerimetre() +"\n";
    }
}
