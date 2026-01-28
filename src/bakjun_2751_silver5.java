import java.io.*;
import java.util.*;

public class bakjun_2751_silver5 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cntString = br.readLine();
        int cnt = Integer.parseInt(cntString);

        List<Integer> list = new ArrayList<>();

        for (int i =0; i< cnt; i++){
            String tmp = br.readLine();
            list.add(Integer.parseInt(tmp));
        }
        
        Collections.sort(list, (a,b) -> {
            if (a > b) {
                return 1;
            }else{
                return -1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int t : list) {
            sb.append(t).append('\n');
        }

        System.out.print(sb.toString());

    }
}
