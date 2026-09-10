import java.util.*;
public class slotMachineGAme_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=100;
        int bet;
        int payout=0;

        System.out.println("****************");
        System.out.println("welcome to slot machine game: ");
        System.out.println("symbols : 👽 👾 🫀 ⛷️ 🧙‍ ");
        System.out.println("****************");

//  to play the slot machine game.
        while(balance>0){
            System.out.println("your balance is "+balance+"rs.");

//  for further play or not choice to player.
            System.out.println("enter 'y' for bet and 'n' for exit : ");
            char choice=sc.next().charAt(0);
            if(choice=='n'){
                System.out.println("you exited the betting.");
                return;
            }

            System.out.println("enter your bet amount.");
            bet=sc.nextInt();

            if(bet>balance){
                System.out.println("you can't bet more than your balance");
                continue;
            }
            else if (bet<=0){
                System.out.println("bet some more money");
                continue;
            }
            else balance-=bet;

            System.out.println("batting....");

            String row[]=spinrow();

            printArray(row);

            payout=hisab(row,bet);
            balance+=payout;
        }
        System.out.println("your balance is over.");
        System.out.println("recharge your wallet , GAMBLER 😂😂 !!!!");
    }
    static String[] spinrow(){
        int c1,c2,c3;
        String symbol[]={"👽","👾","🫀","⛷️","🧙"};
        String row[]=new String[3];
        Random rm=new Random();
        for(int i=0;i<3;i++){
        row[i]=symbol[rm.nextInt(4)+1];
        }
        return row;
    }
    static void printArray(String row[]){
        System.out.println("*************");
        for(int i=0;i<3;i++) {
            System.out.print(row[i]+" | ");
        }
        System.out.print("\n");
        System.out.println("*************");

    }
    static int hisab(String[] row,int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){

            System.out.println("you won! ");
            return switch(row[0]){
                case "👽" -> bet*3;
                case "👾" -> bet*5;
                case "🫀" -> bet*10;
                case "⛷️" -> bet*20;
                case "🧙‍" -> bet*30;
                default -> bet;
            };
        }
        else{
            System.out.println("you lost! ");
            return 0;
        }
    }
}

//  we can return the switch case also as shown in this code with ";" at end of return.