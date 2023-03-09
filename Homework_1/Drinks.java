public class Drinks extends BaseProduct{
    private double volume;

    public Drinks(String name, double price, int count, String unit, double volume){
        super(name, price, count, unit);
        this.volume = volume;
    }

    public String getInfo() {
        return String.format("%s Объем: %s", super.getInfo(), this.volume);  
    }

    public Double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }
}
