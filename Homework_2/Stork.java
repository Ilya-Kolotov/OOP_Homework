package Homework_2;

import Homework_2.Base.Birds;

public class Stork extends Birds{
    public Stork(int height, int weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor, flyingHeight);
    }
    @Override
    public String MakeSound() {
        return String.format("%s - Курлык", super.MakeSound());
    }
}