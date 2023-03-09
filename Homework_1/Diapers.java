import Base.Kids;

public class Diapers extends Kids {
    private String size;
    private int maxWeight;
    private int minWeight;
    private String type;

    public Diapers(String name, double price, int count, String unit, String age, String hypoallergenic,String size, int minWeight,
                    int maxWeight, String type) {
        super(name, price, count, unit, age, hypoallergenic);
        this.size = size;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.type = type;
    }

    public String getInfo() {
        return String.format("%s Размер: %s Мин. вес: %d Макс. вес: %d Тип: %s", 
                                super.getInfo(), this.size, this.minWeight, this.maxWeight, this.type);        
        
    }

    public String getSize() {
        return this.size;
    }
    public int getMinWeight() {
        return this.minWeight;
    }
    public int getMaxWeight() {
        return this.maxWeight;
    }
    public String getType() {
        return this.type;
    }
}
