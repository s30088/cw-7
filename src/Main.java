import cw1.Car;
import cw2.Item;
import cw4.NegativeNumberException;
import cw4.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {

        //cw 1
        List<Car> listOfCars = new ArrayList<>(of(
                new Car("Tesla2", 2002),
                new Car("Tesla1", 2001),
                new Car("Tesla5", 2005),
                new Car("Tesla4", 2004),
                new Car("Tesla7", 2007),
                new Car("Tesla3", 2003),
                new Car("Tesla8", 2008),
                new Car("Tesla6", 2006),
                new Car("Tesla9", 2010),
                new Car("Tesla10", 2009)
        ));

        listOfCars.stream().sorted().forEach(System.out::println);

        //cw 2
        List<Item> listOfItems = new ArrayList<>(of(
                new Item("1", "Item1"),
                new Item("2", "Item2"),
                new Item("3", "Item3"),
                new Item("4", "Item4"),
                new Item("5", "Item5")
        ));

        for (int i = 0; i < listOfItems.size(); i++) {
            listOfItems.get(i).show();
        }
        Map<String, String> mapOfItems = new java.util.HashMap<>();
        for (Item item : listOfItems) {
            mapOfItems.put(item.getId(), item.getName());
        }

        mapOfItems.forEach((key, value) -> System.out.println(key + " " + value));

        //cw 3
        List<Item> listOfItems2 = new ArrayList<>(of(
                new Item("Item2", "2"),
                new Item("Item1", "1"),
                new Item("Item5", "5"),
                new Item("Item4", "4"),
                new Item("Item7", "7"),
                new Item("Item3", "3"),
                new Item("Item8", "8"),
                new Item("Item6", "6"),
                new Item("Item9", "9"),
                new Item("Item10", "10")
        ));

        Map<String, String> mapOfItems2 = new java.util.HashMap<>();
        listOfItems2.subList(0, 5).forEach(item -> mapOfItems2.put(item.getId(), item.getName()));

        //cw 4
        Numbers numbers = new Numbers();
        numbers.fillArray();
        numbers.displayArray();
    }


}