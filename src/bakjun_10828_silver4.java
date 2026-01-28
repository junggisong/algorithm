import java.util.*;
import java.io.*;

public class bakjun_10828_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            String tmp = bf.readLine();
            String [] sp = tmp.split(" ");

            switch(sp[0]){
                case "push" : stack.push(Integer.parseInt(sp[1])); break;
                case "pop" : System.out.println(stack.isEmpty()? -1 : stack.pop()); break;
                case "size" : System.out.println(stack.size()); break;
                case "empty" : System.out.println(stack.isEmpty()? 1 : 0);break;
                case "top" : System.out.println(stack.isEmpty()? -1: stack.peek());break;
            }
        }
    }
}
