public class Kids extends BaseProduct{
    private int age;
    private String hypoallergenic;

    public Kids(String name, double price, int count, String unit, int age, String hypoallergenic){
        super(name, price, count, unit);
        this.age = age;
        this.hypoallergenic = hypoallergenic;
    }

    public String getInfo() {
        return String.format("%s Минимальный возраст: %d Гипоаллергенность: %s", super.getInfo(), this.age, this.hypoallergenic);  
    }

    public Integer getExpirationDate() {
        return this.age;
    }

    public void setExpirationDate(int age){
        this.age = age;
    }
}
