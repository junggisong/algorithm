import java.util.*;
import java.io.*;

public class bakjun_11650_silver5 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String cnt = bf.readLine();
        int cntNum = Integer.parseInt(cnt);
        List<String> list = new ArrayList<String>();
        for(int i = 0 ; i < cntNum; i++){
            list.add(bf.readLine());
        }

        Collections.sort(list, (a,b) -> {
            String [] alineArr = a.split(" ");
            String [] bLineArr = b.split(" ");
           int x = Integer.parseInt(alineArr[0]);
           int secX = Integer.parseInt(bLineArr[0]);
           if (x < secX){
               return -1;
           }if (x == secX){
                int y = Integer.parseInt(alineArr[1]);
                int secY = Integer.parseInt(bLineArr[1]);
                if (y < secY){
                    return -1;
                }else{
                    return 1;
                }
            }else{
               return 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String t: list){
            sb.append(t + "\n");
        }
        System.out.println(sb);

    }
}
