public class FindtheLengthofaString {
    String s = "Hello";

    // void main(){
    //     int count=0;

    //     for(char ch:s.toCharArray()){
    //         count++;
    //     }

    //     IO.print(count);
    // }


    // void main(){
    //     int count=0;

    //     try{
    //     while(true){
    //         s.charAt(count);
    //         count++;
    //     }
    //     }
    //     catch(Exception e){
    //         IO.println(count);
    //     }
    // }




// Using Stream API

    void main(){
        String s = "hello";

        long count = s.chars().count();

        System.out.println(count);
    }
}
