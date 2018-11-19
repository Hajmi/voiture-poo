package voiture_poo;
//Création d'une classe voiture
public class Voiture {
		//Attributs
		public String marque;
		public double vitesse; 
		public int puissance;
		public static int compteur = 0;
		//Mise en place d'un constructeur avec les attributs en paramètre
		public Voiture (String marque, double vitesse, int puissance) {
			
			this.marque = marque;
			this.vitesse = vitesse;
			this.puissance = puissance;
			compteur++; //Variable permettant de compter le nombre de voiture crée a chaque fois qu'on appelle le constructeur
		}
		 //Main
		public static void main(String[] args) {
			
			Voiture car1 = new Voiture("ford",180,90);
			Voiture car2 = new Voiture("citroen",220,110);
			Voiture car3 = new Voiture("renault",160,75);
			
			Voiture[] voitures= new Voiture[compteur];
			voitures[0]=car1;
			voitures[1]=car2;
			voitures[2]=car3;
			
			for (int i=0; i<compteur; i++) {
				System.out.println(voitures[i].toString());
			}
			System.out.println("le nombre de voiture est : "+compteur);
		}
		//Méthode permettant d'afficher les attributs d'un objet voiture
		public String toString() {
			return "je suis une voiture de marque "+this.marque.toUpperCase()+" avec une vitesse de "+this.vitesse+" dont la puissance est "+puissance+" CH";
		}

}
