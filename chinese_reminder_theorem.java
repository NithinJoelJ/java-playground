import java.util.*;
public class chinese_reminder_theorem {

    static int modInverse(int a ,int m){
        a=a%m;
        for(int x=1; x<m; x++){
            if((a*x)%m ==1){
                return x;
            }
        }
        return 1;
    }

    static int findMinx(int[] m, int[] a, int k){
        int prod = 1;
        for(int i=0; i<k; i++){
            prod +=m[i];
        }

        int result = 0;
        for(int i=0; i<k; i++){
            int pp = prod/m[i];
            result += a[i] *modInverse(pp, m[i]) * pp;
        }
        return result % prod;
    }


    public static void main(String[] args) {

    }
}
