import javax.swing.event.SwingPropertyChangeSupport;

public class Programm {

    public static void main(String[] args) {
        Drinks food = new Drinks("milk", 96.36, 2, "шт", 1000);
        System.out.println(food.getInfo());     
    }
   
}
