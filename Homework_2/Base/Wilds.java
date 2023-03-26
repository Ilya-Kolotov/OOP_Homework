package Homework_2.Base;

import java.time.LocalDate;

public class Wilds extends Animals{
    private String areal;
    private LocalDate findingDate;

    public Wilds(int height, int weight, String eyeColor, String areal, int year, int month, int day) {
        super(height, weight, eyeColor);
        this.areal = areal;
        this.findingDate = LocalDate.of(year, month, day);
    }

    @Override
    public String Info() {
        return String.format("Вид животного: %s\n%sСреда обитания: %s\nДата нахождения: %s\n",
                                this.getClass().getSimpleName(), super.Info(), this.areal, this.findingDate);
    }
}
