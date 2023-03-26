package Homework_2;

import Homework_2.Base.Pets;

public class Cat extends Pets {
    private boolean hasWool;

    public Cat(int height, int weight, String eyeColor, String name, String breed, boolean vaccination,
            String woolColor, int year, int month, int day, boolean hasWool) {
        super(height, weight, eyeColor, name, breed, vaccination, woolColor, year, month, day);
        this.hasWool = hasWool;
    }
    @Override
    public String Info() {
        return String.format("%sНаличие шерсти: %s\n",
        super.Info(),this.hasWool ? "Да" : "Нет");
    }

    @Override
    public String MakeSound() {
        return String.format("%s - Мяу", super.MakeSound());
    }
    @Override
    public void ShowAffection() {
        System.out.println("Подошел к человеку и глажусь об его ногу");
    }
    public boolean isHasWool() {
        return hasWool;
    }
    
}
