import java.util.*;
public class xor_kryptering {

    public static void main(String[] args) {

        int one = 1;
        int two = 1;

        int three = (int) (one ^ two);

        System.out.println("Decimal," + three);
        System.out.println("binary, " + Integer.toBinaryString(three));

        int four = (int) (three ^ one);

        System.out.println("Decimal," + four);
        System.out.println("binary, " + Integer.toBinaryString(four));


    }
}