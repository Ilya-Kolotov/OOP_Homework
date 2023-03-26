package Homework_2;

import Homework_2.Base.Wilds;

public class Tiger extends Wilds{
    public Tiger(int height, int weight, String eyeColor, String areal, int year, int month, int day) {
        super(height, weight, eyeColor, areal, year, month, day);
    }
    @Override
    public String MakeSound() {
        return String.format("%s - Р-р-рр-р", super.MakeSound());
    }
    
}
