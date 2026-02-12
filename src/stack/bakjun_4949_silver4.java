import java.util.*;
import java.io.*;

public class bakjun_4949_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            Stack<Character> stack = new Stack<>();
            String lastLine = bf.readLine();
            if(lastLine.equals("."))break;

            boolean chk = true;
            for(int i=0; i<lastLine.length(); i++){
                char c = lastLine.charAt(i);
                if(c == '['){
                    stack.push(c);
                }else if(c == '('){
                    stack.push(c);
                }else if(c == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        chk = false;
                        break;
                    }
                    stack.pop();
                }else if(c == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        chk = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(chk && stack.isEmpty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }


    }
}
