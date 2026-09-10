public class car {
    String name="marcedese";
    String model="maybach";
    int year=2025;
    double price=30000000;
    boolean isRunning=true;
//    System.out.print(model);
    void start(){
        isRunning=true;
        System.out.println("you started the engine");
    }
    void stop(){
        isRunning=false;
        System.out.println("you stopped the engine");
    }

}


