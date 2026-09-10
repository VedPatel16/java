// composition : represents a part of relationship b/w objects
//               for example an engine is part of car.
//               allows complex objects to be constructed from smaller objects.


public class composition_32 {
    public static void main(String[] args) {
        Car c1=new Car("velar",2025,"v6");
//        System.out.println(c1.model);
//        System.out.println(c1.year);
//        System.out.println(c1.engine.type);

        c1.running();
    }
}

class Car{
    String model;
    int year;
    Engine engine;

    Car(String model,int year,String etype){
        this.model=model;
        this.year=year;
        this.engine=new Engine(etype);
    }

    void running(){
        this.engine.start();
        System.out.println("you are running "+model+" "+year+".");
    }
}

class Engine{
    String type;

    Engine(String type){
        this.type=type;
    }

    void start(){
        System.out.println("you started "+type+" engine.");
    }
}
