import java.util.*;
public class dice_roll_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();

        System.out.println("enter the no. of dies you want to roll : ");
        int dice=sc.nextInt();

        if(dice>0) System.out.printf("you are rolling %d dice.",dice);
        else return;
        int roll=0;
        int count=0;
        for(int i=0;i<dice;i++){
            roll= rm.nextInt(1,7);
            rollDice(roll);
            System.out.println("you have rolled "+roll);
            count+=roll;
        }
        System.out.println("total times rolled = "+count);
    }

    static void rollDice(int roll){
        String roll1= """
                -------
               |       | 
               |   ♣   | 
               |       | 
                -------
                """;
        String roll2= """
                -------
               | ♣     | 
               |       | 
               |     ♣ | 
                -------
                """;
        String roll3= """
                -------
               | ♣     | 
               |   ♣   | 
               |     ♣ | 
                -------
                """;
        String roll4= """
                -------
               | ♣   ♣ | 
               |       | 
               |♣    ♣ | 
                -------
                """;
        String roll5= """
                -------
               | ♣   ♣ | 
               |   ♣   | 
               | ♣   ♣ | 
                -------
                """;
        String roll6= """
                -------
               | ♣   ♣ | 
               | ♣   ♣ | 
               | ♣   ♣ | 
                -------
                """;

        switch (roll){
            case 1 -> System.out.println("\n"+roll1);
            case 2 -> System.out.println(roll2);
            case 3 -> System.out.println(roll3);
            case 4 -> System.out.println(roll4);
            case 5 -> System.out.println(roll5);
            case 6 -> System.out.println(roll6);
            default -> System.out.println("not rolled !");
        }

    }
}
