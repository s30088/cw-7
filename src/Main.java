import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
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
    }
}