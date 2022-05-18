package MyIterator;

// 車オブジェクト
public class Car {
    // 車の名前
    private String name;
    // 色
    private String color;

    public Car(String name,String color){
        this.name = name;
        this.color = color;
    }
        
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

}