import java.util.*;


public class Binary_palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String Binary = Integer.toBinaryString(num);
        System.out.println(Binary);

        String reverse = new StringBuilder(Binary).reverse().toString();
        System.out.println(reverse);

        if(reverse.equals(Binary)){
            System.out.println("Plaindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

}
