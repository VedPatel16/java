// objects = an entity that holds data(attributes)
//           and can perform actions(methods)
//           it is a refrence data type

public class oop1_16 {
    public static void main(String[] args) {
        car cr=new car();
        cr.model="s class";
        System.out.println(cr.name);

        cr.start();
        System.out.println(cr.isRunning);
        cr.stop();
        System.out.println(cr.isRunning);
    }

}
