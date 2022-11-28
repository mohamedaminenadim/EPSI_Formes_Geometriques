package fr.epsi.FormeGeometriques;

/**
 * Generic interface to override common methods,
 * specifically the addForme() method which is used
 * for the generic FormeGeometrique class as well as
 * its sub-classes
 */
public interface GenericFormeInterface {

    public void addForme(FormeGeometrique f, int index);
    public void addForme(Cercle cercle, int index);
    public void addForme(Carre Carre, int index);
    public void addForme(Triangle triangle, int index);

}
