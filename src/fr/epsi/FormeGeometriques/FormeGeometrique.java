package fr.epsi.FormeGeometriques;

public abstract class FormeGeometrique {
    public String nom;

    public abstract double CalculPerimetre();

    public String toString() {
        return "La forme " + nom + " qui est un(e) " + this.getClass().getSimpleName().toLowerCase() + " a pour perimetre "+ CalculPerimetre() +"\n";
    }
}
