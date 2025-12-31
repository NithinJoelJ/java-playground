import java.util.Scanner;

public class LexicographicPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        int oddCount = 0;
        char oddChar = ' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'a');
            }
        }

        if (oddCount > 1) {
            System.out.println("No Palindromic String");
        } else {
            String front = "";
            String rear = "";
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'a');
                int count = freq[i] / 2;
                for (int j = 0; j < count; j++) {
                    front = front + c;
                    rear = c + rear;
                }
            }

            String result = front;
            if (oddCount == 1) {
                result = result + oddChar;
            }
            result = result + rear;

            System.out.println(result);
        }

        sc.close();
    }
}