// method overloading -> methods that have the same name but different parameter.
//                    unique signature=name+datatype

public class method_Overloading_11 {
    public static void main(String[] args) {

        printDetails("ved");
        printDetails("maheshbhai",53);
        printDetails("vidhi",27,"physio");
        System.out.println(add(17,11));
        System.out.println(add(17,11,6));
    }
    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }

    static void printDetails(String name){
        System.out.println(name);
    }
    static void printDetails(String name,int age,String occupation){
        System.out.println(name+age+occupation);
    }
    static void printDetails(String name,int age){
        System.out.println(name+age);
    }
}
