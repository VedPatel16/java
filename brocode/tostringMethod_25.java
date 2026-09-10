public class tostringMethod_25 {
    public static void main(String[] args) {
        car c1=new car("marcedese","matbach",2025,"maroon");
        System.out.println(c1.brand);
        System.out.println(c1);

        car c2=new car("land rover","velar",2025,"black");
        System.out.println(c2);
    }
}

class car{
    String brand;
    String model;
    int year;
    String colour;

    car(String brand,String model,int year,String colour){
        this.brand=brand;
        this.model=model;
        this.colour=colour;
        this.year=year;
    }

    @Override
    public String toString(){

        return this.colour+" "+this.year+" "+this.brand+" "+this.model;
    }

}