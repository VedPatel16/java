package bitManupulation_09;

public class getBit_1_54 {
    public static void main(String[] args) {
        int n=5;
        int position=2;
        int bitmask=1<<position;

        if((bitmask & n)==0) System.out.println("bit was zero.");
        else System.out.println("bit was one");
    }
}
