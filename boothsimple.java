import java.util.Scanner;
public class boothsimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int r = sc.nextInt();

        int A=0, Q=r, Q_1 = 0;
        int n=4;
        for(int i=0; i<n; i++){
            int last = Q & 1;
            if(last==0 && Q_1==1){
                A=A+m;
            }else if(last==1 && Q_1==0){
                A=A-m;
            }

            int new_q = Q&1;
            int combined = (A<<n) | (Q & (1<<n)-1);
            combined >>=1;
            A = combined >> n;
            Q = combined & ((1<<n)-1);
            Q_1 = new_q;
        }
        System.out.println(A<<n | Q);

    }
}
