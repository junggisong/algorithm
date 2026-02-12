import java.io.*;
import java.util.*;

public class bakjun_10816_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int hasCnt = Integer.parseInt(bf.readLine());
        HashMap<Integer , Integer> hasCard = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i =0; i<hasCnt; i++){
            int tmp = Integer.parseInt(st.nextToken());
            hasCard.put(tmp, hasCard.getOrDefault(tmp, 0) + 1);
        }

        int chkCnt = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<chkCnt; i++){
            int tmp = Integer.parseInt(st.nextToken());
            sb.append(hasCard.getOrDefault(tmp,0) + " ");
        }
        System.out.print(sb);
    }
}
