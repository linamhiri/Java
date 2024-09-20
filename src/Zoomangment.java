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
        System.out.println(lion);

        Zoo myZoo = new Zoo("belvedere", "tunis" , 20);
        myZoo.displayZoo();

        System.out.println(myZoo);


    }
}
