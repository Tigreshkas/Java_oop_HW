package classwork_2;

import classwork_2.*;
import classwork_2.radio.Radio;
import classwork_2.radio.Sayable;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Симба-Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд Дак"),
                new Fish("Немо")
        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Sayable animal : zoo.getSayable()) {
            System.out.println(animal.say());
        }
        System.out.println("------------------");
        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedRun() + "\n");
        }
        System.out.println("------------------");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedFlyable());
            System.out.println(animal.getHigh() + "\n");
        }
        System.out.println("------------------");
        for (Swimming animal : zoo.getSwimmingList()) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedSwim() + "\n");
        }
        System.out.println("---------Определяем чемпиона по бегу---------");
        System.out.println(zoo.getRunChampions());
        System.out.println("---------Определяем чемпиона по полетам---------");
        System.out.println(zoo.getFlyChampions());
        System.out.println("---------Определяем чемпиона по плаванию---------");
        System.out.println(zoo.getSwimChampions());
    }
}