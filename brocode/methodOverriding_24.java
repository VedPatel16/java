public class methodOverriding_24 {
    public static void main(String[] args) {
        dog d1=new dog();
        cat c1=new cat();
        fish f1=new fish();

        d1.move();
        c1.move();
        f1.move();
    }
}
class animal{
    void move(){
        System.out.println("animal is running");
    }
}
class dog extends animal{}
class cat extends animal{}
class fish extends animal{
    @Override    // it is annotation that shows that this method overridden
    void move(){
        System.out.println("animal is swimming");
    }
}

