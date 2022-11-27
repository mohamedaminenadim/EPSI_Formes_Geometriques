package test;

public class Carre extends FormeGeometrique {
    private String name = super.name;
    private double perimetre = 4*this.cote;
    protected double cote;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public Carre() {
        this.name = "Mon Carre par défaut";
    }

    public Carre(String name){
        this.name = name;
    }

    public double calculerPerimetre() {
        return this.perimetre;
    }
}
