import java.util.Scanner;
public class Hourglass {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Matrix Size: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxsum  = Integer.MIN_VALUE;

        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int sum = matrix[i][j] + matrix[i][j+1]+matrix[i][j+2]+
                        matrix[i+1][j+1]+
                        matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if(sum >maxsum){
                    maxsum = sum;
                }
            }
        }

        System.out.println("Maximum Hourglass Sum: " + maxsum);
        sc.close();
    }
}
