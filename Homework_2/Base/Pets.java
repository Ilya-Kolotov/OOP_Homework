package Homework_2.Base;

import java.time.LocalDate;

public abstract class Pets extends Animals {
    protected String name;
    protected String breed;
    protected boolean vaccination;
    protected String woolColor;
    protected LocalDate birthDate;;
    
    public Pets(int height, int weight, String eyeColor,String name, String breed, boolean vaccination, 
                String woolColor, int year, int month, int day){
        super(height,weight,eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.woolColor = woolColor;
        this.birthDate = LocalDate.of(year, month, day);
    }



    @Override
    public String Info() {
        return String.format("Вид животного: %s\nКличка: %s\nПорода: %s\n%sНаличие вакцины: %s\nЦвет шерсти: %s\nДата рождения: %s\n",
        this.getClass().getSimpleName(), this.name, this.breed, super.Info(), this.vaccination ? "Да" : "Нет", this.woolColor, this.birthDate);
    }
      
    public abstract void ShowAffection();

}