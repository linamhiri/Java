//seance 2
public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages){
        this.animals = new Animal[25];
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
    }
    public displayZoo(Zoo z) {
        System.out.println("Nom : " + z.name);
        System.out.println("Ville : " + z.city);
        System.out.println("Nombre de cages: " + z.nbrCages);
    }

}
