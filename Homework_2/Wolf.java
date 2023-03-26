package Homework_2;

import Homework_2.Base.Wilds;

public class Wolf extends Wilds{
    protected boolean isAlpha;

    public Wolf(int height, int weight, String eyeColor, String areal, int year, int month, int day, boolean isAlpha) {
        super(height, weight, eyeColor, areal, year, month, day);
        this.isAlpha = isAlpha;
    }



    @Override
    public String Info() {
        return String.format("%sВожак: %s\n", super.Info(), this.isAlpha ? "Да" : "Нет");
    }
    @Override
    public String MakeSound() {
        return String.format("%s - Аоооууу", super.MakeSound());
    }
}
