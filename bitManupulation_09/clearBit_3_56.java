package bitManupulation_09;

public class clearBit_3_56 {
    public static void main(String[] args) {
        int n=5;
        int position=2;
        int bitmask=1<<position;

        int newNumber=(~bitmask & n);
        System.out.println(newNumber);
    }
}
//position work like index