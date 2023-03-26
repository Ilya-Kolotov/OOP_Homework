package Homework_2.Base;

public abstract class Birds extends Animals{
    private int flyingHeight;

    public Birds(int height, int weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor);
        this.flyingHeight = flyingHeight;
    }

    public int getFlyingHeight() {
        return this.flyingHeight;
    }

    public void flying() {
        System.out.println("Я лечу на высоте " + this.flyingHeight + " метров");
    }

    @Override
    public String Info() {
        return String.format("Вид животного: %s\n%sВысота полета: %d м\n",this.getClass().getSimpleName(), super.Info(), this.flyingHeight);
    }
}

