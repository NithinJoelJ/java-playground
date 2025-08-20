import java.util.*;

public class strobogrammaticNumbers {
    public static List<String> sn(String num){
        int len = num.length();
        return build(len,len);
    }

    private static List<String> build(int num, int len){
        if(num==0){
            return Arrays.asList("");
        }
        if(num==1){
            return Arrays.asList("0","1", "8");
        }

        List<String> prev = build(num-2, len);
        List<String> result = new ArrayList<>();

        for (String middle:prev){
            if(num!= len){
                result.add('0' + middle + '1');
            }
            result.add('1'+middle+'1');
            result.add('1'+middle+'6');
            result.add('8'+middle+'8');
            result.add('9'+middle+'6');

        }

        return result;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String num = sc.nextLine();
        sc.close();

        List<String> result = sn(num);

        System.out.println(result);

    }
}