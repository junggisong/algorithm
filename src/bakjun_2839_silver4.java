import java.util.*;
import java.io.*;

public class bakjun_2839_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(bf.readLine());
        int kg5 = total/5;
        int namuzi = total - (5*kg5);

        if(namuzi % 3 != 0){
            //5키로 하나 빼고 3으로 채워보기.
            int kg3 = -1;
            for(int i = kg5; i >=0; i--){
                int tmpNam = total - (5 * i);
                if(tmpNam % 3 == 0){
                    kg5 = i;
                    kg3 = tmpNam/3;
                    break;
                }
            }
            if(kg3 == -1){
                System.out.println(kg3);
            }else{
                System.out.println(kg5 + kg3);
            }
        }else{
            System.out.println(kg5 + (namuzi/3));
        }
    }
}
