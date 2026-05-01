import java.util.stream.IntStream;

public class PalindromeString {
    // void main(){
    //     String s = "madam";

    //     int left = 0;
    //     int right = s.length()-1;

    //     while(left<right){
    //         if(s.charAt(left++) != s.charAt(right--)){
    //             IO.println("Not a Pallindrome");
    //             System.exit(0);
    //         }
    //     }
    //     IO.print("Palindrome");

    // }


c

//Using Stream API

    public static void main(String[] args) {
        String s = "madam";

        boolean isPalindrome = IntStream.range(0, s.length() / 2)
            .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
