//static = makes a variable or method belong to the class
//         rather than to any specific object.
//         commonly used for utility methods or shared resources(utility method means inbilt method)



public class staticKeyword_20 {
    public static void main(String[] args) {
        friend f1=new friend("maheshbhai");
        friend f2=new friend("chandrika");

        System.out.println(f1.name);
        System.out.println(f1.count);
// if we don't make it static then it will make it's own static for f1 object.


        System.out.println(f2.name);
        System.out.println(friend.count);
// it is accessing the static directly from the friend class
    }
}

class friend{
    String name;
    static int count=0;

    friend(String nm){
        name=nm;
        count++;
    }
}