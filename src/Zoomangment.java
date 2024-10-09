import java.util.Scanner;

public class Zoomangment {
    //seance 1
    int nbrCages=0;
    String zooName="";
    public static void main(String[] args){
        Zoomangment myZoo =new Zoomangment();
        System.out.println(myZoo.zooName);
        System.out.println(myZoo.nbrCages);
        Scanner myobj = new Scanner(System.in);
        System.out.println("Donner le nom du zoo");
        myZoo.zooName=myobj.nextLine();
        System.out.println("Donner le nombre de cages du zoo");
        myZoo.nbrCages=myobj.nextInt();

        System.out.println("Nom du zoo: " + myZoo.zooName);
        System.out.println("Nombre de cages du zoo: " + myZoo.nbrCages);

        //seance 2
        Animal lion = new Animal("Felidae", "Lion", 4 , true);
        Animal tiger = new Animal("Felidae", "Tiger", 3, true);
        System.out.println(lion);

        //seance 3
        System.out.println("Ajout du lion: " + myZoo.addAnimal(lion)); // true
        System.out.println("Ajout du lion (doublon): " + myZoo.addAnimal(lion)); // false, already added
        System.out.println("Ajout du tigre: " + myZoo.addAnimal(tiger)); // true

        Zoo myZoo = new Zoo("belvedere", "tunis" , 20);
        myZoo.displayZoo();

        System.out.println("Recherche du lion: Index " + myZoo.searchAnimal("Lion")); // Should return the index
        System.out.println("Recherche d'un animal non existant: Index " + myZoo.searchAnimal("Elephant")); // -1

        System.out.println("Suppression du tigre: " + myZoo.removeAnimal(tiger)); // true
        myZoo.displayZoo(); // Display after removal

        System.out.println("Le zoo est plein? " + myZoo.isZooFull());

        scanner.close();


    }
}
