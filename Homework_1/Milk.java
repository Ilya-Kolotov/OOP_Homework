import Base.Drinks;
import java.time.LocalDate;

public class Milk extends Drinks{
    private double fatContent;
    private LocalDate expirationDate;

    public Milk(String name, double price, int count, String unit, double volume, double fatContent, int year, int month, int day){
        super(name, price, count, unit, volume);
        this.fatContent = fatContent;
        this.expirationDate = LocalDate.of(year, month, day);
    }

    public String getInfo() {
        return String.format("%s Процент жирности: %.2f Срок годности: %s", super.getInfo(), this.fatContent, this.expirationDate);  
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public Double getFatContent(){
       return this.fatContent;
    }

    public void setExpirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }

    public void setFatContent(double fatContent){
        this.fatContent = fatContent;
    }
}
