package Base;
public class Hygiene extends BaseProduct{
    private int countInUnit;

    public Hygiene(String name, double price, int count, String unit, int countInUnit){
        super(name, price, count, unit);
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
