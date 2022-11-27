package test;

public class Triangle extends FormeGeometrique {
    private String name = super.name;
    private double perimetre = (this.base + this.hauteur + this.hypothenuse);
    private double base;
    private double hauteur;
    private double hypothenuse;
    private boolean triangleCarre = false;
    private boolean triangleIsocele = false;

    public Triangle(){
        super();
        this.base = 0;
        this.hauteur = 0;
    }

    public Triangle(double base, double hauteur){
        this.base = base;
        this.hauteur = hauteur;
    }

    public Triangle(String name, double base, double hauteur){
        this.name = name;
        this.base = base;
        this.hauteur = hauteur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public double getBase() {
        return base;
    }

    public double getHauteur() {
        return hauteur;
    }


    @Override
    public double calculerPerimetre() {
        return this.perimetre;
    }
}
