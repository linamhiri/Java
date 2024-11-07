package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Parameterized Constructor
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = Math.max(age, 0); // Ensure age is non-negative
        this.isMammal = isMammal;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal [Family=" + family + ", Name=" + name + ", Age=" + age + ", IsMammal=" + isMammal + "]";
    }
}
