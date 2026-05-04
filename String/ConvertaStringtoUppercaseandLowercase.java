public class ConvertaStringtoUppercaseandLowercase {
    // void main(){
    //     String upper="";
    //     String lower="";
    //     String s = "Hello";

    //     for(int i=0;i<s.length();i++){
    //         char ch = s.charAt(i);
            
    //         if(ch>='a' && ch<='z'){
    //             upper+=(char)(ch-32);
    //         }
    //         else{
    //             upper+=ch;
    //         }
    //         if(ch>='A' && ch<='Z'){
    //             lower+=(char)(ch+32);
    //         }
    //         else{
    //             lower+=ch;
    //         }
    //     }

    //     IO.println(upper+" "+lower);
    // }



    void main(){
        String s = "HeLLo";

    StringBuilder upper = new StringBuilder();
    StringBuilder lower = new StringBuilder();

    for(char c : s.toCharArray()) {

        if(c >= 'a' && c <= 'z') {
            upper.append((char)(c - 32));
        } else {
            upper.append(c);
        }

        if(c >= 'A' && c <= 'Z') {
            lower.append((char)(c + 32));
        } else {
            lower.append(c);
        }
    }

    System.out.println(upper.toString());
    System.out.println(lower.toString());
    }





    
}
