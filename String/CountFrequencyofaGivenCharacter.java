public class CountFrequencyofaGivenCharacter {
    // void main(){
    //     String s = "programming";
    //     char target = 'g';

    //     int count = 0;

    //     for(int i = 0; i < s.length(); i++) {
    //         if(s.charAt(i) == target) {
    //             count++;
    //         }
    //     }

    //     System.out.println(count);
    // }





// Using Stream API
    
    void main(){
        String s = "programming";
        char target = 'g';

        long count = s.chars()
                        .filter(c-> c == target)
                        .count();

        System.out.println(count);
    }
}
