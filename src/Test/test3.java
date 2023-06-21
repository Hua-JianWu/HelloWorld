package Test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        Integer a = sc.nextInt();
        for(int i = 2; i <= a; i++) {
            sum = sum + new Solution().FindOfFive(sc.nextInt());
        }
        System.out.println(sum);
    }
}

class Solution {
    public int FindOfFive(int num) {
        int sum = 0;
        if (num <= 0) {
            return 0;
        } else {
            while (num > 0) {
                if (num % 10 == 5) {
                    sum++;
                }
                num /= 10;
            }
        }
        return sum;
    }
}
