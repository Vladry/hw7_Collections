package hw7.Family;

import hw7.Family.People.Family;
import hw7.Family.People.Human;
import hw7.Family.People.Man;
import hw7.Family.People.Woman;

public class Main {
    public static void main(String[] args) {

        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mom = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mom);
        dad.setFamily(family);
        mom.setFamily(family);
        int totalChildren = 3;
        Human[] children = new Human[totalChildren];
        int girlsCounter = 0;
        for (int i = 0; i < totalChildren; i++) {
            children[i] = family.bornChild();
            System.out.println(children[i].toString());
            if (children[i].getName().contains("девочка")) {
                girlsCounter++;
            }
        }
        System.out.println("всего создано детей: " + totalChildren);
        System.out.println("из них девочек: " + girlsCounter);
    }
}



