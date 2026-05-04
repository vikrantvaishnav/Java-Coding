public class CheckwhetheraStringcontainsonlydigits {
    String s = "12345g";

    // void main(){
    //     boolean flag = true;
    //     int i=0;

    //     try{
    //     while(flag){
    //         if(!Character.isDigit(s.charAt(i))){
    //             flag = false;
    //             throw new Exception();
    //         }
    //         i++;
    //     }
    // }
    // catch(Exception e){
    //     if(flag== true){
    //         IO.println("Contain only digits ");
    //     }
    //     else{
    //         IO.println("Contain other than digits ");
    //     }
    // }
    // }






    // void main(){
    //     boolean isDigit = true;
    //     for(int i=0; i<s.length();i++){
    //         char ch = s.charAt(i);

    //         if(ch<'0'|| ch>'9'){
    //             isDigit = false;
    //             break;
    //         }
    //     }

    //     System.out.println(isDigit);
    // }






//Using Stream API

    void main(){
        String s = "12345";

        boolean result = !s.isEmpty() &&
                        s.chars().allMatch(Character::isDigit);

        System.out.println(result);
    }

}
