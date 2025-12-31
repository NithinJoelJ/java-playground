import java.util.Scanner;

public class maximum_product_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int maxproduct = arr[0];
        int minproduct = arr[0];
        int result = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]<0){
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;
            }
            maxproduct = Math.max(arr[i], maxproduct*arr[i]);
            minproduct = Math.min(arr[i], minproduct*arr[i]);

            result = Math.max(result, maxproduct);
        }

        System.out.println("The Maximum product subarray: " + result);
    }
}
