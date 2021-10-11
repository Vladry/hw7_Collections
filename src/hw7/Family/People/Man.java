package hw7.Family.People;

import hw7.Family.Animals.Pet;

final public class Man extends Human {

    Man(){
        super();
    }

    public Man(String name, String surname, int year){
        super(name, surname, year);
    }
    Man(String name, String surname, int year,
        int iq, String[][] schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }

    public void repairCar(){
        System.out.println("Третий год чиним машину");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println(pet.getNickname() + " , почему тапочки несёшь, ты не домашний рабчик, ты - крутецкий пёс");
    }
}
