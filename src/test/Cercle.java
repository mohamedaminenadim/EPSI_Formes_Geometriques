package test;

public class Cercle extends FormeGeometrique {
    private String name = super.name;

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

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    private double perimetre = this.rayon*pi*2;
    private double rayon;
    private static final double pi = Math.PI;

    public Cercle(){
        this.name = "Mon cercle par défaut";
    }

    public double calculerPerimetre() {
        return this.perimetre;
    }
}
