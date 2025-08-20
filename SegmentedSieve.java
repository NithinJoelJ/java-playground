import java.util.*;
public class SegmentedSieve{
    static int N = 100000;
    static boolean[] bool = new boolean[N+1];

    static void simpleSeive(){
        for (int i =0; i<N; i++){
            bool[i] = true;
        }

        for (int i=2; i*i<=N; i++){
            if(bool[i]==true){
                for(int j = i*i; j<N; j+=i)
                {
                    bool[j] = false;
                }
            }
        }
    }

    static ArrayList<Integer> genreatePrimes(int n){
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=2; i*i<n; i++){
            if(bool[i]){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        simpleSeive();
        ArrayList<Integer> al = genreatePrimes(high);

        boolean[] dummy = new boolean[high-low+1];
        Arrays.fill(dummy, true);

        for(int prime:al){
            int fm = (low/prime)*prime;
            if(fm<low){
                fm+=prime;
            }
            int start = Math.max(fm, prime*prime);
            for (int j=start; j<=high; j+=prime){
                dummy[j-low] = false;
            }
        }

        for(int i=low; i<=high; i++){
            if(dummy[i-low]){
                System.out.println(i);
            }
        }


    }
}