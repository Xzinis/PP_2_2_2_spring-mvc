package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO implements CarD {

    private static int CARS_ID;
    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(++CARS_ID, "Logan", "d647kd"));
        car.add(new Car(++CARS_ID, "BMW", "s877ky"));
        car.add(new Car(++CARS_ID, "Lexus", "e594sd"));
        car.add(new Car(++CARS_ID, "Nissan", "r587nb"));
        car.add(new Car(++CARS_ID, "Lada", "r357st"));
    }
    
    @Override 
    public List<Car> table(Integer count) {
        if (count >= 5) {
            return car;
        }
        else {
            return car.subList(0, count);
        }
    }
}
