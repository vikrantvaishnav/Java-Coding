import java.util.Arrays;

public class CountNumberofWords {
    // void main(){
    //     String s = "   Hello   world   Java   ";
    //     int count = 0;
    //     s= s.strip();
    //     boolean isCount = false;

    //     for( char c : s.toCharArray()){

    //         if( c != ' ' && isCount== false){
    //             count++;
    //             isCount = true;
    //         }
    //         else if( c == ' '){
    //             isCount = false;
    //         }
    //     }

    //     IO.println(count);
    // }



    // void main(){
    //     String s = "   Hello   world   Java   ";
    //     String [] st = s.strip().split("\\s+");
    //     IO.println("Count :"+st.length);

    // }



//Stream API

    void main(){
        String s = "Hello world Java";

    long count = Arrays.stream(s.strip().split("\\s+"))
                   .filter(word -> !word.isEmpty())
                   .count();

        System.out.println(count);
    }

}
