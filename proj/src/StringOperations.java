import java.io.*;
import java.util.*;

public class StringOperations {
    private ArrayList<String> stringList;

    public StringOperations() {
        this.stringList = new ArrayList<>();
    }

    // 1. Добавление и удаление объектов
    public void addObject(String str) {
        stringList.add(str);
    }

    public void removeObject(String str) {
        stringList.remove(str);
    }

    // 2. Поиск одинаковых элементов с подсчетом совпадений
    public Map<String, Integer> findDuplicates() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : stringList) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        return frequencyMap;
    }

    public void displayCollection() {
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StringOperations stringOps = new StringOperations();

        // Пример использования
        stringOps.addObject("Hello");
        stringOps.addObject("World");
        stringOps.addObject("Hello");
        stringOps.addObject("Java");
        stringOps.addObject("Programming");

        // Вывести коллекцию
        System.out.println("Original Collection:");
        stringOps.displayCollection();

        System.out.println("\nDuplicate Frequencies:");
        System.out.println(stringOps.findDuplicates());
    }

}
