package Base;
public class BaseProduct {
    protected String name;
    protected double price;
    protected int count;
    protected String unit;

    public BaseProduct(String name, double price, int count, String unit) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    public String getInfo() {
        return String.format("Продукт: %s Название товара: %s Цена: %.2f Количество: %d Единица измерения: %s",
                                getClass().getSimpleName(), this.name, this.price, this.count, this.unit);         
        
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getCount() {
        return this.count;
    }
    public String getUnit() {
        return this.unit;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setCount(int count){
        this.count = count;
    }
}
