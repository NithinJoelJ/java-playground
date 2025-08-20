import java.io.*;
import java.util.Scanner;
public class Warm_Up {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Console con = System.console();
        if(con==null){
            System.out.print("No concole");
            return;
        }
        String name = scan.nextLine();
        System.out.println("Your name is "+name);
        char[] ch = con.readPassword("Enter your password: ");
        String pass  = String.valueOf(ch);
        System.out.println(ch);
    }
}