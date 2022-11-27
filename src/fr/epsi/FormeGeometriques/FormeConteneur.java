package fr.epsi.FormeGeometriques;

public class FormeConteneur implements GenericFormeInterface {

	public FormeGeometrique[] tableauFormes;

	public FormeConteneur(){
		this.tableauFormes = new FormeGeometrique[10];
	}

	public FormeConteneur(int size){
		this.tableauFormes = new FormeGeometrique[size];
	}

	/**
	 * @deprecated
	 * @see addForme down below
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

	/**
		* Generic method to add form to the initialized list of 'FormeGeometrique' in this class
		* @param forme the geometric form in question
		* @param index the index of the list where the element will be added
		* @returns void
	 */
	@Override
	public void addForme(FormeGeometrique forme, int index) {
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
		try{
			this.tableauFormes[index] = triangle;
		} catch (Exception e){
			System.out.printf("Exception encountered :\n'%s'\n", e.getMessage());
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
	
	public static void main(String[] args) {
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

	}
}
