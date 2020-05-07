import java.util.Stack;

public class Problem20 {

    public static void main(String[] args) {
        System.out.println(isValid("{}{}{}}{()[]"));
    }

    public static boolean isValid(String s){
        boolean bool = true;
        Stack s1 = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                s1.push(')')        ;
            }
            if(ch=='['){
                s1.push(']');
            }
            if(ch=='{'){
                s1.push('}');
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if (s1.isEmpty() || (char)s1.pop()!=ch){
                    return false;
                }
            }
        }

        //System.out.println(s1);
        return bool;
    }
}
