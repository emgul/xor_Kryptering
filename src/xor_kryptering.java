import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;
public class xor_kryptering {

    public static void main(String[] args) {


        Scanner tgb = new Scanner(System.in);

        System.out.print("tal 1 = ");
        int one = tgb.nextInt();
        System.out.print("tal 2 = ");
        int two = tgb.nextInt();

        int three = (int) (one ^ two);

        System.out.println("Decimal," + three);
        System.out.println("binary, " + Integer.toBinaryString(three));

        int four = (int) (three ^ one);

        System.out.println("Decimal," + four);
        System.out.println("binary, " + Integer.toBinaryString(four));


    }
}