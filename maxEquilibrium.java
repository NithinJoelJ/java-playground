import java.util.Scanner;
public class maxEquilibrium {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int total_sum = 0;
        for(int num:arr){
            total_sum += num;
        }

        int left = 0;
        int maxEquilibrium = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            total_sum-=arr[i];

            if(left == total_sum){
                if(left>maxEquilibrium){
                    maxEquilibrium = arr[i];
                }
            }

            left += arr[i];
        }

        if(maxEquilibrium == Integer.MIN_VALUE){
            System.out.println("No Equilibrium Found");
        }else{
            System.out.println("Equilibrium Found: "+maxEquilibrium);
        }
    }
}
