public class Isomorphic_String {
    void main(){
        String s = "egg";
        String t = "add";
        boolean flag= true;

        if(s.length()!=t.length()){
            IO.println("Not");
            System.exit(0);
        }

        char[] ch = new char[256];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(ch[ch1]=='\u0000'&& ch[ch2]=='\u0000'){
                ch[ch1] = ch2;
                ch[ch2] = ch1;
            }
            else if(ch[ch1]!=ch2 || ch[ch2]!=ch1){
                IO.print("not");
                flag= false;
                break;
            }
            
        }
        if(flag){

            IO.println("yes");
        }
        
    }
}
