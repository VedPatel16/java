package bitManupulation_09;

public class setBit_2_55 {
    public static void main(String[] args) {
        int n=5;
        int position=1;
        int bitmask=1<<position;

        int newNumber=((bitmask | n));
        System.out.println(newNumber);
    }
}
