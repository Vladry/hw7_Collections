package hw7.Family.Animals;

import java.util.List;
import java.util.Set;

public abstract class Pet {

    protected Species species;
    protected String nickname;
    protected int age;
    protected int trickLevel; //from 0 to 100
    protected Set<String> habits;

    static {
        System.out.println("загружается новый класс Pet");
    }

    {
        System.out.println("создается новый объект Pet");
    }


    Pet() {
    }

    Pet(String nickname) {
        this.nickname = nickname;
    }

    Pet(String nickname, int age, int trickLevel) {
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public void eat() {
        System.out.println("Я кушаю!");
    }

    public abstract void respond();

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }


    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }


    @Override
    public String toString() {
        return species + " {nickname='" + nickname + "',  age=" + age + ", trickLevel=" +
                trickLevel +
                "habits=" + getHabits().toString() +
                "}\n";
    }

    @Override
    protected void finalize() {
        System.out.println("Deleting an instance of Pet");
    }
}


