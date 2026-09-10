// now we are use actually type parameter

public class generics_2_37 {
    public static void main(String[] args) {
        Box<String> box=new Box<>();  // it is like ArrayList
        box.setItem("apple");
        box.setItem("ved");
        System.out.println(box.getItem());

// ********* it can be used for different data type data like this ******************

//      Box<Integer> box = new Box<>();
//      box.setItem(17);
//      box.setItem(11);

//      Box<Double> box = new Box<>();
//      box.setItem(17.06);
//      box.setItem(11.06);

//        etc......................................
    }
}

class Box<T>{
    T item;    // we don;t set the type of item , it can be String or int etc

    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;  //  or   return this.item;
    }
}