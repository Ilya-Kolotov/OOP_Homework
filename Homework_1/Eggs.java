import Base.Foods;

public class Eggs extends Foods{
    private int countInUnit;

    public Eggs(String name, double price, int count, String unit, int year, int month, int day, int countInUnit){
        super(name, price, count, unit, year, month, day);
        this.countInUnit = countInUnit;
    }

    public String getInfo() {
        return String.format("%s Количество штук в упаковке: %s", super.getInfo(), this.countInUnit);  
    }

    public Integer getCountInUnit() {
        return this.countInUnit;
    }

    public void setCountInUnit(int countInUnit){
        this.countInUnit = countInUnit;
    }
}
