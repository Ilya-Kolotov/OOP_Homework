package Homework_4;

public class Program {
    public static void main(String[] args) {
        DynamicArray<Integer> storage = new DynamicArray<>();

        storage.add(2);
        storage.add(1);
        storage.add(3);
        System.out.println(storage);
        storage.sort();
        System.out.println(storage);
        storage.remove(1);
        System.out.println(storage);
    }
}
