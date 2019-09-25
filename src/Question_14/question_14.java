package Question_14;
import java.util.*;

public class question_14 {
        public static int countArmstrongNum( int ArmstrongNumber){ //проверяем сколько цифр в числе
            int i = 0;
            if (ArmstrongNumber > 0)
                while (ArmstrongNumber != 0) {
                    ArmstrongNumber = ArmstrongNumber / 10;
                    i++;
                }
            return i;
        }
    public static boolean howMuchArmstrongNumber(int ArmstrongNumber){ //поиск числа армстронга
        int share = 0;
        int res = 0;
        int num = ArmstrongNumber;
        int count = countArmstrongNum(ArmstrongNumber);

        while (ArmstrongNumber!=0) { //находим поледнюю цифру в числе
            share = ArmstrongNumber%10;
            res = res+((int) Math.pow(share, count));
            ArmstrongNumber = ArmstrongNumber/10;
        }
        if (num==res) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter k: "); //диапазон поиска от 1 до к
        int k = scanner.nextInt();
        System.out.println("All armstrong numbers from 1 to "+k+":");
        for (int nums=1;nums<=k;nums++) {
            if (howMuchArmstrongNumber(nums)) {
                System.out.print(nums + ", ");
            }
        }
    }
}
