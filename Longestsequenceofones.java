import java.util.Scanner;
public class Longestsequenceofones {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int left=0;
        int zerocount=0;
        int maxlength = 0;

        for(int right=0; right<n; right++){
            if(arr[right]==0){
                zerocount++;
            }

            while(zerocount>1){
                if(arr[left]==0){
                    zerocount--;
                }
                left++;
            }

            maxlength = Math.max(maxlength, right-left+1);
        }
        System.out.println("Longest Flipped: "+maxlength);
    }

}
