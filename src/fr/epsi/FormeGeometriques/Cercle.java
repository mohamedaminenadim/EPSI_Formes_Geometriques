package fr.epsi.FormeGeometriques;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cercle extends FormeGeometrique {
	protected double rayon;

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Cercle(double rayon) {
		this.rayon=rayon;
	}

	public Cercle(String nom,double rayon) {
		this(rayon);
		this.nom = nom;
	}

	@Override
	public double CalculPerimetre() {
		double perimetre = (rayon * 2) * Math.PI;
		return perimetre;
	}
}
