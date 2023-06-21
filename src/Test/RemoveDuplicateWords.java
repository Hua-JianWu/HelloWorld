package Test;

import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = new Solution1().removeDuplicateWords(input);
        System.out.println(output);
        sc.close();
    }
}

class Solution1 {
    public static String removeDuplicateWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        String prevWord = null;
        for (String word : words) {
            if (prevWord == null || !word.equalsIgnoreCase(prevWord)) {
                result.append(word).append(" ");
            }
            prevWord = word;
        }

        return result.toString().trim();
    }
}
