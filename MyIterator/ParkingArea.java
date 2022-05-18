package MyIterator;

import java.util.*;

public class ParkingArea implements Iterable<Car>{
    
    private List<Car> cars = new ArrayList<>();

    // 指定されたiteratorの隣にあるオブジェクトを返す    
    public Car getCarAt(int index){
        if(cars.size() > index){
            return cars.get(index);
        }
        return null;
    }

    public int getLength(){
        return cars.size();
    }

    public void appendCar(Car car){
        cars.add(car);
    }

    @Override
    public Iterator<Car> iterator(){
        return new ParkingAreaIterator(this);
    }
}
