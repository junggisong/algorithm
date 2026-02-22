import java.util.*;
import java.io.*;

public class bakjun_11047_silver4 {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        String[] sLine = line.split(" ");
        int coinCnt = Integer.parseInt(sLine[0]);
        int won = Integer.parseInt(sLine[1]);
        List<Integer> list = new ArrayList<>();

        for(int i =0; i<coinCnt; i++){
            list.add(Integer.parseInt(bf.readLine()));
        }

        int answer = 0;
        int left = won;
        for(int i=list.size()-1; i>=0; i--){
            int coin = list.get(i);
            int na = left/coin;
            if(na > 0){
                answer += na;
                left = left%coin;
            }
        }

        System.out.println(answer);
    }
}
