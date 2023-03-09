package Base;
public class Kids extends BaseProduct{
    private String age;
    private String hypoallergenic;

    public Kids(String name, double price, int count, String unit, String age, String hypoallergenic){
        super(name, price, count, unit);
        this.age = age;
        this.hypoallergenic = hypoallergenic;
    }

    public String getInfo() {
        return String.format("%s Минимальный возраст: %s Гипоаллергенность: %s", super.getInfo(), this.age, this.hypoallergenic);  
    }

    public String getAge() {
        return this.age;
    }

    public String getHypoallergenic() {
        return this.hypoallergenic;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setHypoallergenic(String hypoallergenic){
        this.hypoallergenic = hypoallergenic;
    }

}
