package Base;
import java.time.LocalDate;

public class Foods extends BaseProduct {
    private LocalDate expirationDate;

    public Foods(String name, double price, int count, String unit, int year, int month, int day){
        super(name, price, count, unit);
        this.expirationDate = LocalDate.of(year, month, day);
    }

    public String getInfo() {
        return String.format("%s Срок годности: %s", super.getInfo(), this.expirationDate);  
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }
}
