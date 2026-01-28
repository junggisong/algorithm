import java.util.*;
import java.io.*;

public class bakjun_7568_silver5_chk {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int count = Integer.parseInt(line);

        int[][] info = new int[count][2];

        for (int i =0; i< count; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            info[i][0] = Integer.parseInt(st.nextToken());
            info[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<count ; i++){
            int rank = 1;
            for (int j =0; j<count; j++){
                if (info[j][0] > info[i][0] && info[j][1] > info[i][1]){
                    rank++;
                }
            }
            sb.append(rank).append(" "); }
        System.out.print(sb);
    }
}
