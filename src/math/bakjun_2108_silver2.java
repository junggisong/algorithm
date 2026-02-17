package math;

import java.util.*;
import java.io.*;

public class bakjun_2108_silver2 {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> chkBin = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int cnt = Integer.parseInt(bf.readLine());
        int sum = 0;
        for(int i =0; i<cnt; i++){
            int tmp = Integer.parseInt(bf.readLine());
            sum += tmp;
            chkBin.put(tmp,chkBin.getOrDefault(tmp,0)+1);
            list.add(tmp);
        }

        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(list.size()-1);
        int binChk = Integer.MIN_VALUE;

        List<Integer> chk = new ArrayList<>();

        //평균
        System.out.println(Math.round((float) sum /cnt));
        //중간값
        System.out.println(list.get(cnt/2));
        //최빈값
        for(Map.Entry<Integer,Integer> entry : chkBin.entrySet()){
            if(entry.getValue() > binChk){
                chk.clear();
                binChk = entry.getValue();
                chk.add(entry.getKey());
            }else if(entry.getValue() == binChk){
                chk.add(entry.getKey());
            }
        }

        if(chk.size() > 1){
            Collections.sort(chk);
            System.out.println(chk.get(1));
        }else{
            System.out.println(chk.get(0));
        }

        //범위
        System.out.println(max - min);
    }
}
