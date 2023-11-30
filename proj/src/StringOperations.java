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

    public void displayCollection() {
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StringOperations stringOps = new StringOperations();

        stringOps.addObject("eefe");
        stringOps.addObject("Woefrld");

        stringOps.removeObject("eefe");

        System.out.println("Original Collection:");
        stringOps.displayCollection();
    }

}
