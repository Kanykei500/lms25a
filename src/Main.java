import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,Avto> carHashMap=new HashMap<>();
        carHashMap.put(new Car(1,333),new Avto(2022,"Honda",
                "Black","2000$"));
        carHashMap.put(new Car(2,555),new Avto(2006,"Mazda",
                "White","3000$"));
        carHashMap.put(new Car(3,555),new Avto(2020,"Toyota",
                "Blue","1000$"));
        System.out.println(carHashMap .entrySet());


    }
}