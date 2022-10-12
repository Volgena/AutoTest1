package org.example;
import java.io.*;
import java.util.Objects;


/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int aNum, bNum, cNum;

        do{
            System.out.println("Enter value A: ");
            aNum = Integer.parseInt(br.readLine());
            System.out.println("Enter value B: ");
            bNum = Integer.parseInt(br.readLine());
            System.out.println("Enter value C: ");
            cNum = Integer.parseInt(br.readLine());

            Triangle.checkTriangle(aNum, bNum, cNum);

            System.out.println("Again? Y/N: ");
        }while(Objects.equals(br.readLine().toUpperCase(), "Y"));
    }
}
