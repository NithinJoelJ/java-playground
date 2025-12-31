import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int index=-1;

        int maxcount = 0;

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                index=i;
            }
        }

        if(maxcount > n/2){
            System.out.println("Mjority Element: "+arr[index]);
        }else{
            System.out.println("There is no majority element");
        }
    }
}
