import java.util.*;
import java.io.*;

public class bakjun_1920_silver5 {


    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = bf.readLine();
        int firstCnt = Integer.parseInt(firstLine);

        StringTokenizer st = new StringTokenizer(bf.readLine());
        HashSet<Integer> firstHash = new HashSet<>();

        for (int i = 0; i< firstCnt; i++){
            firstHash.add(Integer.parseInt(st.nextToken()));
        }

        String sec = bf.readLine();
        st = new StringTokenizer(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< Integer.parseInt(sec); i++){
            int tmp = Integer.parseInt(st.nextToken());
            if (firstHash.contains(tmp)){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }

        System.out.print(sb);
    }
}
