package test;

public class FormeGeometrique {
    //Attributs
    protected String name;

    //Constructeurs
    public FormeGeometrique(){
        this.name = "Forme géométrique par défaut";
    }

    public FormeGeometrique(String name){
        this.name = name;
    }
    //Méthodes
    public double calculerPerimetre(){
        return 0L;
    }
}
