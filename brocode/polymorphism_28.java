public class polymorphism_28 {
    public static void main(String[] args) {
//
        bike b1=new bike();
        care c1=new care();
        boat bo1=new boat();

        vehicles[] vehicle={b1,c1,bo1};
        for( vehicles vehi : vehicle){
            vehi.go();
        }
//        we used enhanced for loop instead of this;
//        b1.go();
//        c1.go();
//        bo1.go();

    }
}
abstract class vehicles{
    abstract void go();
}
class bike extends vehicles{
    @Override
    void go(){
        System.out.println("bike is going");
    }
}
class care extends vehicles{
    @Override
    void go(){
        System.out.println("car is going");
    }

}
class boat extends vehicles{
    @Override
    void go(){
        System.out.println("boat is going");
    }
}