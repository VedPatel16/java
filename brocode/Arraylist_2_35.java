import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_2_35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> food=new ArrayList<>();
        System.out.println("enter the number of fruits");
        int numOfFood=sc.nextInt();
        sc.nextLine();
//        String tempFood;
        for(int i=0;i<numOfFood;i++){
            System.out.println("enter the "+i+1+"food");
            String tempFood=sc.nextLine();
            food.add(tempFood);
        }
        System.out.println(food);}
}
