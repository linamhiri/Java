package tn.esprit.gestionzoo.entities;


public abstract class Aquatic extends Animal  {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic other = (Aquatic) obj;
        return getName().equals(other.getName()) && getAge() == other.getAge() && habitat.equals(other.habitat);
    }

}
