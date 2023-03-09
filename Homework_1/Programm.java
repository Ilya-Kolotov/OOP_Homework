public class Programm {

    public static void main(String[] args) {
        Milk milk1 = new Milk("Green_village", 85.5, 2, "бут", 930, 3.2, 2023, 03, 19);
        Lemonade lemonade1 = new Lemonade("CoolCola", 75, 4, "бут", 1);
        Bread bread1 = new Bread("Бородинский", 35, 4, "шт", 2023, 03, 19, "ржаная");
        Eggs eggs1 = new Eggs("Окское", 71.4, 3, "шт", 2023, 04, 19, 10);
        Mask mask1 = new Mask("Защитная", 15, 16, "шт", 10);
        ToiletPaper toiletPaper1 = new ToiletPaper("Мягкая", 49.99, 11, "шт", 10, 3);
        Diapers diaper1 = new Diapers("Merries", 1254.6, 18, "шт", "9 месяцев", "Да", "M", 9, 15, "Трусики");
        Pacifiers pacifier1 = new Pacifiers("Avent", 458.2, 9, "шт", "0 месяцев", "Да");

        System.out.println(milk1.getInfo()); 
        System.out.println(lemonade1.getInfo());      
        System.out.println(bread1.getInfo()); 
        System.out.println(eggs1.getInfo()); 
        System.out.println(mask1.getInfo()); 
        System.out.println(toiletPaper1.getInfo()); 
        System.out.println(diaper1.getInfo()); 
        System.out.println(pacifier1.getInfo());
    }
    
   
}
