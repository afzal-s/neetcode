package arraysandhashing;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String nameOne = "racecar";
        String nameTwo = "carrace";

        System.out.println(isAnagram(nameOne, nameTwo));
    }

    private static boolean isAnagram(String nameOne, String nameTwo) {

        if (nameOne.length() != nameTwo.length()) {
            return false;
        }

        char[] nameOneSort = nameOne.toCharArray();
        char[] nameTwoSort = nameTwo.toCharArray();
        Arrays.sort(nameOneSort);
        Arrays.sort(nameTwoSort);
        return Arrays.equals(nameOneSort, nameTwoSort);
    }
}
