package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //FormeGeometrique
        FormeGeometrique formeGeometrique = new FormeGeometrique();
        System.out.println("Perimètre par défaut d'une fome géométrique" + formeGeometrique.calculerPerimetre());
        //Triangle
        Triangle triangle = new Triangle(5,10.3);
        System.out.printf("Le périmètre d'un triangle %,.2f x %,.2f est : %,.2f", triangle.getBase(), triangle.getHauteur(), triangle.calculerPerimetre());
        //Cercle

        //Carre
    }
}