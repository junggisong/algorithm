import java.util.*;
import java.io.*;

public class bakjun_2527_silver3_chk {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int arrCnt = Integer.parseInt(bf.readLine());
        int [] point = new int[arrCnt];
        int [] plus = new int[arrCnt];
        for(int i =0; i<arrCnt; i++){
            point[i] = Integer.parseInt(bf.readLine());
        }

        plus[0] = point[0];

        if(arrCnt >= 2){
            plus[1] = point[0] + point[1];
        }

        if(arrCnt >= 3){
            plus[2] = Math.max(point[0] + point[2], point[1] + point[2]);
        }

        for(int i = 3; i < arrCnt; i++){
            plus[i] = Math.max(
                    plus[i-2] + point[i],
                    plus[i-3] + point[i-1] + point[i]
            );
        }

        System.out.println(plus[arrCnt-1]);




    }

}
