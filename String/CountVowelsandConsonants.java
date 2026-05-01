public class CountVowelsandConsonants {
    // void main(){
    //     String str = "Hello World";
    //     int vowels = 0, consonants = 0;
    //     str.trim().toLowerCase();

    //     for(char ch : str.toCharArray()){
    //         if(Character.isLetter(ch)){
    //             if("aeiou".indexOf(ch) != -1){
    //                 vowels++;
    //             }
    //             else{
    //                 consonants++;
    //             }
    //         }
    //     }

    //     IO.println("Vowels:"+ vowels+" Consonants :"+ consonants);

    // }



//Using Stream API

    void main(){
        String str = "Hello World";
        long vowels = str.toLowerCase().chars()
                        .filter( c->"aieou".indexOf(c) != -1).count();

        long consonants = str.toLowerCase().chars()
                        .filter( c->Character.isLetter(c) &&"aieou".indexOf(c) == -1).count();

        IO.println("Vowels:"+ vowels+" Consonants :"+ consonants);

    }

}
