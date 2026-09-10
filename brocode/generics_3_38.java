public class generics_3_38 {
    public static void main(String[] args) {
        Product<String,Integer> product1=new Product<>("phone",10000);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        Product<String,Double> product2=new Product<>("ticket",100.00);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
class Product<T,U>{
    T item;
    U price;

    Product(T item,U price){
        this.item=item;
        this.price=price;
    }

    public U getPrice(){
        return price;
    }
    public T getItem(){
        return this.item;
    }
}

