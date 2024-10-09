//seance 2
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    //seance 3
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return name.equals(animal.name) && family.equals(animal.family);
    }

    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + '}';
    }

}
