import java.util.*;
import java.io.*;
public class bakjun_1764_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        String [] lSplit= line.split(" ");
        int first = Integer.parseInt(lSplit[0]);
        int second = Integer.parseInt(lSplit[1]);
        Set<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<first; i++){
            set.add(bf.readLine());
        }

        for(int i =0; i<second; i++){
            String tmp  = bf.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for(String tmp: result){
            System.out.println(tmp);
        }

    }
}
