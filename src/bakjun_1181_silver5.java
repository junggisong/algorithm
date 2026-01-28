import java.io.*;
import java.util.*;

public class bakjun_1181_silver5 {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cntStr = br.readLine();
        int cnt = Integer.parseInt(cntStr);


        Set<String> setData = new HashSet<>();

        for (int i =0; i<cnt; i++){
            String line = br.readLine();
            setData.add(line);
        }

        ArrayList<String> list = new ArrayList<>(setData);

        Collections.sort(list,(a,b) ->{
            if (a.length() < b.length()){
                return -1;
            }else if (a.length() == b.length()){
                return a.compareTo(b);
            }else{
                return 1;
            }
        });




        for (String tmp: list){
            System.out.println(tmp);
        }

    }
}
