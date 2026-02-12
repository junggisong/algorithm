import java.util.*;
import java.io.*;

// tip: each public class is put in its own file
public class bakjun_1929_silver3
{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        String [] sp = line.split(" ");

        int f = Integer.parseInt(sp[0]);
        int s = Integer.parseInt(sp[1]);

        StringBuffer sb = new StringBuffer();

        for(int i = f; i <= s; i++){
            //1이랑 본인을 제외한 수로 나눠지면 안된다.
            if(i == 1){
                continue;
            }
            boolean chk = false;
            for(int j =2; j*j <= i; j++){
                if(i%j == 0){
                    chk = true;
                    break;
                }
            }
            if(!chk){
                sb.append(i+"\n");
            }

        }
        System.out.println(sb);
    }
}
