import java.io.*;
import java.util.*;
public class bakjun_1436_silver5 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String numStr = bf.readLine();
        int num = Integer.parseInt(numStr);

        //666이 세개 이상 들어가면 된다.
        //1부터 10,000까지 수입력 들어오면 666이 들어간 숫자
        List<String> list = new ArrayList<>();
        int k = 666;
        while(true){
            if (list.size() == num){
                System.out.println(list.get(num-1));
                break;
            }
            String kString = String.valueOf(k);
            if (kString.contains("666")){
                list.add(kString);
            }
            k++;
        }
    }
}

