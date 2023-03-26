package Homework_2.Base;

public abstract class Animals {
    protected int height;
    protected int weight;
    protected String eyeColor;

    public Animals(int height, int weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    public String MakeSound(){
        return String.format("%s", this.getClass().getSimpleName());
    }

    public String Info() {
        return String.format("Рост: %d\nВес: %d\nЦвет глаз: %s\n", height, weight, eyeColor);        
    }
}
