import java.util.*;
import java.io.*;
public class bakjun_10814_silver5 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        int cnt = Integer.parseInt(n);
//        String[] lineArr = new String[cnt];
//        for (int i=0; i<cnt; i++){
//            lineArr[i] = bf.readLine();
//        }

        List<String> lineArr = new ArrayList<>();
        for (int i =0; i<cnt; i++){
            lineArr.add(bf.readLine());
        }
        Collections.sort(lineArr, (a,b)->{
            String[] aArr = a.split(" ");
            String[] bArr = b.split(" ");
            if (Integer.parseInt(aArr[0]) < Integer.parseInt(bArr[0])){
                return -1;
            }else if(Integer.parseInt(aArr[0]) == Integer.parseInt(bArr[0])){
                return 0;
            }
            else{
                return 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String t  : lineArr){
            sb.append(t + "\n");
        }

        System.out.println(sb);

    }

}
