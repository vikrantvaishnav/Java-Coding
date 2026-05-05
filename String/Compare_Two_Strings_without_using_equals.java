public class Compare_Two_Strings_without_using_equals {

    String s1 = "hello";
    String s2 = "hello";

//     void main(){
//         boolean isEqual= true;

//         if(s1.length() != s2.length()) {
//     isEqual = false;
//     } else {
//         // Step 2: compare characters
//         for(int i = 0; i < s1.length(); i++) {
//             if(s1.charAt(i) != s2.charAt(i)) {
//                 isEqual = false;
//                 break;
//             }
//         }

//     }
//     System.out.println(isEqual);
// }







    //Using Stream API



    void main(){
        boolean isEqual = s1.length() == s2.length() &&
        java.util.stream.IntStream.range(0, s1.length())
        .allMatch(i -> s1.charAt(i) == s2.charAt(i));

        System.out.println(isEqual);
    }
}
