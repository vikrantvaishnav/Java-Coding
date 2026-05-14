import java.util.Stack;

public class ValidParentheses {
  

    void main(){
        String s = "({[{]})";

        Stack<Character> st = new Stack<>();
        Boolean valid =true;
        for(char ch :s.toCharArray()){
            if(ch =='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    valid = false;
                    break;
                }

                char top = st.pop();

                if((ch == ')' && top != '(') || (ch == '}' && top != '{') ||(ch == ']' && top != '[')){
                    
                valid = false;
                break;

                }
            }
        }

        if(!st.isEmpty()) {
        valid = false;
        }

        System.out.println(valid);


    }
}
