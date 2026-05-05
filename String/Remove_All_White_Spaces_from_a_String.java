public class Remove_All_White_Spaces_from_a_String {
    String s="  Hello   World  ";
    // void main(){
    //     StringBuilder sb = new StringBuilder();
    // for(char c:s.toCharArray()){
    //     if(c !=' '){
    //         sb.append(c);
    //     }
    // }
    // IO.println(sb);
    // }



    // void main(){
    //     String result = s.replaceAll("\\s", "");

    //     IO.println(result);
    // }




// Using Stream API


    void main(){

    String result = s.chars()
            .filter(c -> !Character.isWhitespace(c))
            .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
            .toString();

    System.out.println(result);
    }
}
