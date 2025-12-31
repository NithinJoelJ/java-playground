import java.util.Scanner;

public class SwapNibble{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int Swapnum;
        Swapnum=((num & 0X0F)<<4 |(num & 0xF0)>>4 );
        System.out.println("Before Swapped: "+Swapnum);
        System.out.println("After Swapped: "+Swapnum);
    }
}