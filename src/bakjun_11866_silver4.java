import java.util.*;
import java.io.*;

public class bakjun_11866_silver4 {

    public static void main(String[]args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=first; i++){
            q.add(i);
        }
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        int chk = 1;
        while(!q.isEmpty()){
            int n = q.poll();
            if(chk == second){

                sb.append(q.isEmpty()?n : n +", ");
                chk = 1;
            }else{
                q.add(n);
                chk++;
            }
        }
        sb.append(">");

        System.out.println(sb);

    }
}
