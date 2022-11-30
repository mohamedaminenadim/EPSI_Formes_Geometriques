package fr.epsi.FormeGeometriques;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FormeConteneur implements GenericFormeInterface {

	public FormeGeometrique[] tableauFormes;
	public int length;

	public FormeConteneur(){
		this.tableauFormes = new FormeGeometrique[10];
		this.length = this.tableauFormes.length;
	}

	public FormeConteneur(int size){
		this.tableauFormes = new FormeGeometrique[size];
		this.length = this.tableauFormes.length;
	}

	/**
	 * @deprecated
	 */
	/*
	public void addForme() throws IndexOutOfBoundsException {
		int index = 0;
		String forme = "";
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Saisir l'index du tableau (entre 0 et 9) pour ajouter une forme :");
			index = sc.nextInt();
			System.out.print("Saisir la forme à ajouter :");
			forme = sc.next();
		
			if(forme.length() == 1) {
				System.out.print("saisir son rayon: ");
				double rayon = sc.nextDouble();
				FormeGeometrique f = new Cercle(forme,rayon);
				tableauFormes[index] = f;
				System.out.println(tableauFormes[index]);
			}

			if(forme.length() == 4) {
				System.out.print("saisir sa coté: ");
				double coté = sc.nextDouble();
				FormeGeometrique f = new Carre(forme,coté);
				tableauFormes[index] = f;
				System.out.println(tableauFormes[index]);
			}

			if(forme.length() == 3) {
				System.out.print("saisir sa coté: ");
				double coté = sc.nextDouble();
				FormeGeometrique f = new Triangle(forme,coté);
				tableauFormes[index] = f;
				System.out.println(tableauFormes[index]);
			}
		} catch (NegativeArraySizeException exception) {
			System.out.println("Exception rencontrée :\n" + exception.getMessage());
		}
	}
	*/

	public int verifSize(int index){
		while (index < 0 || index > this.length){
			System.out.printf("\nVeuillez saisir un index entre 0 et %d\n", this.length);
			Scanner scanner = new Scanner(System.in);
			index = scanner.nextInt();
		}
		return index;
	}

	/**
	* Generic method to add form to the initialized list of 'FormeGeometrique' in this class
	* @param forme the geometric form in question
	* @param index the index of the list where the element will be added
	* @returns void
	*/
	@Override
	public void addForme(FormeGeometrique forme, int index) {
		index = verifSize(index);
		try{
			this.tableauFormes[index] = forme;
		} catch (Exception e){
			System.out.printf("Exception encountered :\n'%s'\n", e.getMessage());
		}
	}

	@Override
	/**
	 * @Overrides addForme method for Cercle
	 * @param cercle the circle in question
	 * @param index the index of the list where the element will be added
	 * @returns void
	 */
	public void addForme(Cercle cercle, int index){
		index = verifSize(index);
		try{
			this.tableauFormes[index] = cercle;
		} catch (Exception e){
			System.out.printf("Exception encountered :\n'%s'\n", e.getMessage());
		}
	}

	@Override
	/**
	 * @Overrides addForme method for Carre
	 * @param Carre the square in question
	 * @param index the index of the list where the element will be added
	 * @returns void
	 */
	public void addForme(Carre Carre, int index){
		index = verifSize(index);
		try{
			this.tableauFormes[index] = Carre;
		} catch (Exception e){
			System.out.printf("Exception encountered :\n'%s'\n", e.getMessage());
		}
	}

	@Override
	/**
	 * @Overrides addForme method for Triangle
	 * @param triangle the triangle in question
	 * @param index the index of the list where the element will be added
	 * @returns void
	 */
	public void addForme(Triangle triangle, int index){
		index = verifSize(index);
		try{
			this.tableauFormes[index] = triangle;
		} catch (Exception e){
			System.out.printf("Exception encountered :\n'%s'\n", e.getMessage());
		}
	}

	public FormeGeometrique getMaxPerimetre() {
		try {
			double max = 0;
			int index = -1, index_of_min = 0;
			for (FormeGeometrique forme : this.tableauFormes){
				index++;
				if (forme != null && forme.CalculPerimetre() > max){
					max = forme.CalculPerimetre();
					index_of_min = index;
				}
			}
			return this.tableauFormes[index_of_min];
		} catch (Exception e){
			e.getStackTrace();
			return null;
		}
	}

	/**
	 * @returns
	 */
	public FormeGeometrique getMinPerimetre() {
		try {
			double min = 0;
			int index = -1, index_of_min = 0;
			for (FormeGeometrique forme : this.tableauFormes){
				index++;
				if (forme != null && forme.CalculPerimetre() < min){
					min = forme.CalculPerimetre();
					index_of_min = index;
				}
			}
			return this.tableauFormes[index_of_min];
		} catch (Exception e){
			e.getStackTrace();
			return null;
		}
	}

	@Override
	/**
	 * @Overrides toString default method
	 *
	 */
	public String toString() {
		String description = "\nVoici la description du tableau de l'instance de la classe '" + this.getClass().getSimpleName() + "' :\n";
		if (this.tableauFormes.length > 0){
			try {
				for (FormeGeometrique forme : this.tableauFormes) {
					if (forme != null){
						description += forme.toString();
					}
				}
			} catch (Exception e){
				System.out.printf("Could not add form to the description of the class.\nException thrown :\n'%s'\n", e.getMessage());
			}
		}
		else description = "Le tableau est vide";

		return description;
	}

	public void affichageMenu() {
		/**
		 * The local variables are used to initialize the menu options
		 * They are paired with their order number
		 */

		String separator = "-----";
		String header = separator + " Menu principal " + separator;
		String carre = "Créer un carré";
		String cercle = "Créer un cercle";
		String triangle = "Créer un Triangle";
		String liste = "Afficher la liste des formes";
		String max = "Afficher la forme ayant le plus grand périmètre";
		String min = "Afficher la forme ayant le plus petit périmètre";
		String quit = "Quitter";
		ArrayList<String> menu = new ArrayList<>();

		menu.add(0, header);
		menu.add(1, carre);
		menu.add(2, cercle);
		menu.add(3, triangle);
		menu.add(4, liste);
		menu.add(5, max);
		menu.add(6, min);
		menu.add(7, quit);

		for (String element : menu) {
			int index = menu.indexOf(element);
			if (index == 0){
				System.out.println(header);
			}
			else {
				System.out.printf(" %d - %s\n", index, element);
			}
		}
		System.out.println("Veuillez saisir un nombre\n");
	}

	public int getFirstNullIndex(){
		for(int i = 0; i < this.length; i++){
			FormeGeometrique forme = this.tableauFormes[i];
			if (forme == null){
				return i;
			}
		}
		return -1;
	}

	/**
	 *
	 * @param choix The choice of the user
	 * @returns true if the user chooses 7
	 */
	public int selectionMenu(int choix_initial, int choix) {
		String line = "----------------------------------";
		Scanner stringScanner = new Scanner(System.in);
		Scanner doubleScanner = new Scanner(System.in);

		affichageMenu();
		choix = (int) doubleScanner.nextDouble();

		switch (choix){
			default:
				choix = 0;
				break;

			case 0:
				affichageMenu();
				break;

			case 1:
				System.out.println("----- Création d'un carré -----");
				try {
					System.out.println("Saisissez le nom de votre carré");
					String nom = stringScanner.next();
					System.out.println("Saisissez la longueur du côté de votre carré");
					double cote = doubleScanner.nextDouble();

					Carre carre = new Carre(nom, cote);
					this.addForme(carre, getFirstNullIndex());
					System.out.println(line);
				} catch(Exception e){
					e.getStackTrace();
				}
				break;

			case 2:
				System.out.println("----- Création d'un cercle -----");
				try {
					System.out.println("Saisissez le nom de votre cercle");
					String nom = stringScanner.next();
					System.out.println("Saisissez le rayon de votre cercle");
					double rayon = doubleScanner.nextDouble();

					Cercle cercle = new Cercle(nom, rayon);
					this.addForme(cercle, getFirstNullIndex());
					System.out.println(line);
				} catch (Exception e){
					e.getStackTrace();
				}
				break;

			case 3:
				System.out.println("----- Création d'un triangle -----");
				try {
					System.out.println("Saisissez le nom de votre triangle");
					String nom = stringScanner.next();
					System.out.println("Saisissez la longueur du côté de votre triangle");
					double cote = doubleScanner.nextDouble();

					Triangle triangle = new Triangle(nom, cote);
					this.addForme(triangle, getFirstNullIndex());
					System.out.println(line);
				} catch (Exception e){
					e.getStackTrace();
				}
				break;

			case 4:
				System.out.println("----- Liste d'éléments -----");
				System.out.println(this);
				System.out.println(line);
				break;

			case 5:
				System.out.println("----- Plus grand périmètre -----");
				FormeGeometrique max = this.getMaxPerimetre();
				System.out.printf("La forme %s a le plus petit périmètre qui est de : %.2f\n", max, max.CalculPerimetre());
				System.out.println(line);
				break;

			case 6:
				System.out.println("----- Plus petit périmètre -----");
				FormeGeometrique min = this.getMinPerimetre();
				System.out.printf("La forme %s a le plus petit périmètre qui est de : %.2f\n", min, min.CalculPerimetre());
				System.out.println(line);
				break;

			case 7:
				System.out.println("----- Au revoir -----");
				System.out.println(line);
				return -1;
		}
		return selectionMenu(choix_initial, choix);
	}

	public static void main(String[] args) throws IOException {
		/*Des exemples pour tester la classe et ses méthodes */
		Cercle cercle = new Cercle("C",2);
		Carre Carre = new Carre("ABDC",3);
		Triangle triangle = new Triangle("ABC",5);

		System.out.print(cercle);
		System.out.print(Carre);
		System.out.print(triangle);

		FormeConteneur conteneur = new FormeConteneur();
		conteneur.addForme(cercle, 0);
		conteneur.addForme(Carre, 1);
		conteneur.addForme(triangle, 3);

		System.out.println(conteneur);
		int result = conteneur.selectionMenu(0,0);

		conteneur.getMaxPerimetre();
		conteneur.getMinPerimetre();
		while( result != -1 ){
			conteneur.selectionMenu(0, 0);
		}

	}
}
