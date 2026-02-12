import java.util.*;
import java.io.*;


public class bakjun_18110_silver4 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int [] arr = new int[n];

        //30퍼 인원 구하기
        double perCont =Math.round(n * 0.15);
        int perCount = (int)perCont;

        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        int avgCnt = 0;
        int avgSum = 0;

        for(int i = perCount; i< arr.length-perCont; i++){
            avgSum += arr[i];
            avgCnt++;
        }
        double avg = (double) avgSum /avgCnt;
        System.out.println(Math.round(avg));
    }
}
