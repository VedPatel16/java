// inheritance = one class inherent the attributes and methods from another class.
//               like child inherent the parents,parent inherent grandparent.

// use : suppose that same kind of thousand class ; you have to change same thing in all
//       at that time to prevent the 1000 class editing we edit parent class by using inheritance.

// -> first parent class will access, after that child class will access
// -> child class can have the additional methods or attribute which are not in parent.

public class inheretence_21 {
    public static void main(String[] args) {

        dog d1=new dog();
        cat c1=new cat();

        d1.eat();
        c1.eat();
    }
}

class animal{
    boolean isAlive;

    animal(){
        System.out.println(" parent");  // we written this bcz khabar pade k always
                            // pehla parent class access thay pachi child acces  thay
        isAlive=true;
    }
    void eat(){
        System.out.println("animal is eating");
    }
}
class dog extends animal{
    int lives;
    dog(){
        System.out.println("child dog");
        lives=1;
    }
}
class cat extends animal{
    int lives;
    cat(){
        System.out.println("child cat");
        lives=9;
    }
}
