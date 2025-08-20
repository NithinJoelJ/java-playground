import java.util.*;

public class prime_sieve_practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find the primeNumber: ");
        int num = sc.nextInt();
        Boolean[] bool = new Boolean[num];
        for(int i=0; i<num; i++){
            bool[i]=true;
        }

        for(int i=2; i<Math.sqrt(num);i++){
            if(bool[i]==true){
                for(int j=i*i; j<num; j=j+i){
                    bool[j]=false;
                }
            }
        }

        System.out.println("The Prime Numbers are: ");
        for(int i=0; i<num; i++){
            if(bool[i]==true){
                System.out.println(i);
            }
        }
    }
        }