public class Find_the_First_Non_Repeated_Character_in_a_String {
    String s = "aaabncf";
     void main(){
        int[] freq = new int[26];

    for(char c : s.toCharArray()){
        freq[c-'a']++;
    }

    for(char c : s.toCharArray()){
        if(freq[c-'a']==1){
            IO.println(c+" "+freq[c-'a']);
            break;
        }
    }
}
}
