
public class constructor_17 {
    public static void main(String[] args) {
        person p1= new person("ved","cleaning",20);  // when we are calling
//                                          this , actually we calling line 19.
        System.out.println(p1.name);
        System.out.println(p1.hobby);
        System.out.println(p1.age);
        System.out.println(p1.salary);

        person p2= new person("patel","driving",21);
        System.out.println(p2.name);
        System.out.println(p2.hobby);
        System.out.println(p2.age);
        System.out.println(p2.salary);
    }
}

class person{
    String name;
    String hobby;
    int age;
    double salary;

    person(String name,String hobby,int age){
        this.name=name;
        this.hobby=hobby;
        this.age=age;

        salary=250000; // ******* it is possible ******
    }
}
