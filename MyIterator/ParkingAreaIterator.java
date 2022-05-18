package MyIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkingAreaIterator implements Iterator<Car>{

    private ParkingArea pa;
    private int index;

    public ParkingAreaIterator(ParkingArea pa){
        this.pa = pa;
        index = 0;
    }

    // iteratorの隣にオブジェクトが存在するかを判定
    @Override
    public boolean hasNext(){
        if(index < pa.getLength()){
            return true;
        }else{
            return false;
        }
    }

    // iteratorを次に進める
    @Override
    public Car next(){
        if(!hasNext()){        
            throw new NoSuchElementException();
        }
        Car ret = pa.getCarAt(index);
        index++;
        return ret;                
    }
}
