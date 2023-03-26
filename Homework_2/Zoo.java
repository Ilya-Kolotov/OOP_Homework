package Homework_2;

import java.util.ArrayList;
import java.util.List;

import Homework_2.Base.Animals;

public class Zoo {
    private List<Animals> animals = new ArrayList<>();


    public void addAnimal(Animals item) {
        this.animals.add(item);
    }

    public void deleteAnimal(int index) {
        this.animals.remove(index-1);
    }

    public void showAnimal(int index) {
        System.out.println(this.animals.get(index-1).Info());
    }

    public void showAllAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + 1 + "." + this.animals.get(i).getClass().getSimpleName());
        }
    }

    public void getSound(int index) {
        System.out.println(this.animals.get(index-1).MakeSound());
    }

    public void allSound() {
        for (Animals animal : animals) {
            System.out.println(animal.MakeSound());
        }
    }
}