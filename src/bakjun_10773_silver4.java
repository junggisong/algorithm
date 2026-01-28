import java.util.*;
import java.io.*;

public class bakjun_10773_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< cnt; i++){
            Integer tmp = Integer.parseInt(bf.readLine());
            if(tmp == 0){
                stack.pop();
            }else{
                stack.push(tmp);
            }
        }
        int sum = 0;
        for(int s : stack){
            sum+= s;
        }

        System.out.println(sum);


    }
}
