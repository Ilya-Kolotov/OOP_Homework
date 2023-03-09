import Base.Hygiene;

public class ToiletPaper extends Hygiene {
    private int countLayer;

    public ToiletPaper(String name, double price, int count, String unit, int countInUnit, int countLayer){
        super(name, price, count, unit, countInUnit);
        this.countLayer = countLayer;
    }

    public String getInfo() {
        return String.format("%s Количество слоев: %s", super.getInfo(), this.countLayer);  
    }

    public Integer getCountLayer() {
        return this.countLayer;
    }

    public void setCountLayer(int countLayer){
        this.countLayer = countLayer;
    }
}
