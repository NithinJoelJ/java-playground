import java.util.Scanner;
public class Karatsubae {
    public static int karatsubaefunc(int x, int y){
        if(x<10 || y<10){
            return x*y;
        }
        int n = Math.max(numdigits(x), numdigits(y));
        int half = n/2;
        int pow = (int) Math.pow(10, half);

        int a = x/pow;
        int b = x%pow;
        int c = y/pow;
        int d = y%pow;

        int p1 = karatsubaefunc(a,c);
        int p2 = karatsubaefunc(b,d);
        int p3 = karatsubaefunc(a+b, c+d);

        return p1*(int) Math.pow(10, 2*half) + (p3-p1-p2)*pow+p2;
    }

    public static int numdigits(int n){
        int count=0;
        while(n>0){
            n /=10;
            count++;
        }
        if(count==0){
            return 1;
        }else{
            return count;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int x = sc.nextInt();
        System.out.println("Enter an number: ");
        int y = sc.nextInt();

        int product = karatsubaefunc(x,y);
        System.out.println(product);

    }
}
