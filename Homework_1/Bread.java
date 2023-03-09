import Base.Foods;

public class Bread extends Foods {
    private String flour;

    public Bread(String name, double price, int count, String unit, int year, int month, int day, String flour){
        super(name, price, count, unit, year, month, day);
        this.flour = flour;
    }

    public String getInfo() {
        return String.format("%s Тип муки: %s", super.getInfo(), this.flour);  
    }


    public String getFlour() {
        return this.flour;
    }


    public void setFlour(String flour){
        this.flour = flour;
    }

}
