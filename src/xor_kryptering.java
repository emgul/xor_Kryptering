import java.io.*;
import java.util.*;

public class xor_kryptering {

    public static void main(String[] args) throws IOException {

        int place = -1;

        String fil = "minfil.txt";

        FileReader fr = new FileReader(fil);
        BufferedReader infil = new BufferedReader(fr);

        String rad = infil.readLine();
        System.out.println("Okrypterat = " + rad);
        infil.close();

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        String alphabet = "abcdefghijklmopqrstuvwxyz";
        for (int i = 0; i < rad.length(); i++) {
            //System.out.print(alphabet.charAt(r.nextInt(alphabet.length())));
            sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
        }
        String result = sb.toString();
        System.out.println("nyckel = " + result);

        File newTextFile = new File("nyckel.txt");
        FileWriter fw = new FileWriter(newTextFile);
        fw.write(result);
        fw.close();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < rad.length(); i++) {
            char xorchar = (char) (rad.charAt(i) ^ result.charAt(i));
            System.out.print(xorchar);
            
        }




    }

}