//overloaded constructor : allows a class to have multiple constructors
//                         with different parameters lists.
//                         enables objects to be initialized in different ways



public class overloadedConstructor_18 {
    public static void main(String[] args) {
        user u0=new user();
        u0.display();
        user u1=new user("ved");
        u1.display();
        user u2=new user("mahesh","vcmp1711@gmail.com");
        u2.display();

        user u6=new user("mahajan","nnnn",20);
    }
}

class user{
    String name;
    String email;
    int age;

    user(){
        this.name="guest";
        this.email="not given";
        this.age=0;
    }
    user(String name){
        this.name=name;
        this.email="not given";
        this.age=0;
    }
    user(String name,String email){
        this.name=name;
        this.email=email;
        this.age=0;
    }

    user(String name, String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }

    void display(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
    }
}
