package develhope.java.finalcouse.finalweek;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println(isPalindrome(989));
//        System.out.println(strStr("sadbutsad", "sad"));
//        System.out.println(strStr("hello", "ll"));
//        System.out.println(strStr("mississippi", "pi"));
//        System.out.println();
//        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(int x) {
        String strX = Integer.valueOf(x).toString();
        for(int i = 0; i < strX.length()/2; i++) {
            if(strX.charAt(i) != strX.charAt(strX.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int strStr(String haystack, String needle) {


        for(int i =0; i <= haystack.length() - needle.length()   ; i++) {
            String substring = haystack.substring(i, needle.length() + i);
            System.out.println(substring);
            if(substring.equals(needle)) {
                return i;
            }

        }

        return -1;
    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int num = nums[0];
        int count = 1;

        for(int i=1; i < nums.length; i++) {
            if(nums[i] == num) {
                count++;
            }

            System.out.println(num + "--> " + count);
            if( count == 1 ) {
                return num;
            } else {
                num = nums[++i];
                count = 1;
            }
        }

        return num;

    }

    public static boolean isPalindrome(String s) {

        StringBuilder builder = new StringBuilder();

        for(int i =0; i< s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                builder.append(c);
            }
        }

        System.out.println(builder.toString());
        System.out.println(s);

        String originalBuilder = builder.toString();
        return builder.reverse().toString().equalsIgnoreCase(originalBuilder);

    }

    public int strStrV2(String haystack, String needle) {


       for(int i =0; i <= haystack.length() - needle.length(); i++) {
           if(haystack.substring(i, needle.length() + 1).equals(needle)) {
               return i;
           }
       }

        return -1;
    }
}