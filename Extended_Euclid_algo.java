import java.util.Scanner;
public class Extended_Euclid_algo {

    public static int extendedgcd(int a, int b, int[] xy){
        if(a==0){
            xy[0]=0;
            xy[1]=1;
            return b;
        }
        int[] temp = new int[2];
        int gcd = extendedgcd(b%a, a, temp);

        xy[0] = temp[1] - (b/a) * temp[0];
        xy[1] = 0;

        return gcd;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] xy = new int[2];
        int gcd = extendedgcd(a,b,xy);
        System.out.println(gcd);
    }
}
