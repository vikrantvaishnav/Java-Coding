import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    // void main(){
    //     String s = "Hello";
    //     for(int i=s.length()-1; i>=0;i--){
    //         IO.print(s.charAt(i));
    //     }
    // }


    // void main(){
    //     String s = "Hello";
    //     IO.println(new StringBuilder(s).reverse()); // olleH
    // }



//Optimal for Interview
    // void main(){
    //     String str ="Hello";
    //     char [] ch = str.toCharArray();

    //     int i=0;int j=ch.length-1;

    //     while(i<j){
    //         char temp = ch[i];
    //         ch[i++] = ch[j];
    //         ch[j--] = temp;
    //     }

    //     IO.println(new String(ch));
        
    // }



    // void main(){
    //     String str = "Hello";

    //     StringBuilder sb =new StringBuilder(str);

    //     int left =0; int right = sb.length()-1;

    //     while(left<right){
    //         char ch = sb.charAt(left);
    //         sb.setCharAt(left++, sb.charAt(right));
    //         sb.setCharAt(right--, ch);
    //     }

    //     IO.println(sb);
    // }
    




     public static void main(String[] args) {
        String str = "Hello";

        String reversed = IntStream.range(0, str.length())
            .mapToObj(i -> str.charAt(str.length() - i - 1))
            .map(String::valueOf)
            .collect(Collectors.joining());

        System.out.println(reversed);
    }

}
