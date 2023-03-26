package Homework_2;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Cat cat = new Cat(26, 35, "black", "Tom", "Sfinks", true, "grey", 2019, 6, 9, false);
        Dog dog = new Dog(26, 35, "white", "Rick", "mops", true, "grey", 2019, 6, 9, true);
        Tiger tiger = new Tiger(57, 150, "green", "tibet", 2021, 4, 8);
        Wolf wolf  = new Wolf(65, 115, "red", "Ural", 2022, 9, 15, true);
        Chicken chicken = new Chicken(45, 10, "black", 2);
        Stork stork = new Stork(45, 23, "black", 200);

        Zoo animals = new Zoo();
        Scanner scanner = new Scanner(System.in);

        int action = 0;
        while (action != 7) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Убрать животное из зоопарка");
            System.out.println("3. Показать информацию о конкретном животном");
            System.out.println("4. Показать животных в зоопарке");
            System.out.println("5. Заставить животное издавать звук");
            System.out.println("6. Заставить всех животных издавать звук");
            System.out.println("7. Выйти из программы");
            System.out.println("Выберите действие: ");

            action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println("1. Тигр");
                    System.out.println("2. Волк");
                    System.out.println("3. Аист");
                    System.out.println("4. Собака");
                    System.out.println("5. Кот");
                    System.out.println("6. Курица");
                    System.out.println("Выберите животное: ");

                    while (true) {
                        int chois = scanner.nextInt();
                        if (chois == 1) {
                            animals.addAnimal(tiger);
                            break;
                        } else if (chois == 2) {
                            animals.addAnimal(wolf);
                            break;
                        } else if (chois == 3) {
                            animals.addAnimal(stork);
                            break;
                        } else if (chois == 4) {
                            animals.addAnimal(dog);
                            break;
                        } else if (chois == 5) {
                            animals.addAnimal(cat);
                            break;
                        } else if (chois == 6) {
                            animals.addAnimal(chicken);
                            break;
                        } else {
                            System.out.println("Неверный выбор");
                        }
                    }
                    break;
                case 2:
                    animals.showAllAnimals();
                    System.out.println("Выберите номер животного: ");
                    int chois = scanner.nextInt();
                    animals.deleteAnimal(chois);
                    break;
                case 3:
                    animals.showAllAnimals();
                    System.out.println("Выберите номер животного: ");
                    chois = scanner.nextInt();
                    animals.showAnimal(chois);
                    break;
                case 4:
                    animals.showAllAnimals();
                    break;
                case 5:
                    animals.showAllAnimals();
                    System.out.println("Выберите номер животного: ");
                    chois = scanner.nextInt();
                    animals.getSound(chois);
                    break;
                case 6:
                    animals.allSound();
                    break;
                case 7:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный ввод, попробуйте еще раз.");
            }
        }
    }
}
