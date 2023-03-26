package Homework_2;

import Homework_2.Base.Birds;

public class Chicken extends Birds{
    public Chicken(int height, int weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor, flyingHeight);
    }
    @Override
    public String MakeSound() {
        return String.format("%s - Кудах", super.MakeSound());
    }
}

