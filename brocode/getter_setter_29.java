public class getter_setter_29 {
    public static void main(String[] args) {

        nation n1=new nation("india",77);
//        System.out.println(n1.age);
//        System.out.println(n1.name);
        System.out.println("nation is "+n1.getterName()+" "+n1.getterAge()+" years old");
        n1.setterAge(100000);
        n1.setterName("bharat");

        System.out.println("nation is "+n1.getterName()+" "+n1.getterAge()+" years old");
    }
}

class nation{
    private  String name;    // final key word
    private int age;

    nation(String name,int age){
        this.name=name;
        this.age=age;
    }

    String getterName(){
       return name;
    }
    int getterAge(){
        return age;
    }

    void setterAge(int age){
        this.age=age;
    }
    void setterName(String name){
        this.name=name;
    }
}
