package MyIterator;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ParkingArea pa = new ParkingArea();
        pa.appendCar(new Car("プリウス","赤"));
        pa.appendCar(new Car("プリウス","青"));
        pa.appendCar(new Car("アクア","赤"));
        pa.appendCar(new Car("アクア","青"));

        Iterator<Car> it = pa.iterator();

        while(it.hasNext()){
            Car car = it.next();
            System.out.println(car.getName() + " : " + car.getColor());
        }
    }
    
}
