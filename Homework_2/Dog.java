package Homework_2;

import Homework_2.Base.Pets;

public class Dog extends Pets {

    private boolean isTraining;

    public Dog(int height, int weight, String eyeColor, String name, String breed, boolean vaccination,
    String woolColor, int year, int month, int day, boolean isTraining) {
        super(height, weight, eyeColor, name, breed, vaccination, woolColor, year, month, day);
        this.isTraining = isTraining;
    }

    @Override
    public String Info() {
        return String.format("%sСпособность к тренировке: %s",
        super.Info(),this.isTraining ? "Да" : "Нет");
    }

    @Override
    public String MakeSound() {
        return String.format("%s - Гав", super.MakeSound());
    }
    @Override
    public void ShowAffection() {
        System.out.println("Весело машет хвостом");
    }

    public boolean isTraining() {
        return isTraining;
    }
}
