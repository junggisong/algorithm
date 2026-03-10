import java.util.*;
import java.io.*;

public class bakjun_2606_silver3_chk {

    public static Map<Integer,Set<Integer>> map = new HashMap<>();
    public static Set<Integer> result = new HashSet<>();

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        result.add(1);

        int nodeCount = Integer.parseInt(bf.readLine());
        int connectCount = Integer.parseInt(bf.readLine());

        for(int i=0; i<connectCount; i++){
            Set<Integer> tmpSet = new HashSet<>();
            String [] tmp = bf.readLine().split(" ");

            int first = Integer.parseInt(tmp[0]);
            int second = Integer.parseInt(tmp[1]);

            if(map.containsKey(first)){
                map.get(first).add(second);
            }else{
                tmpSet.add(second);
                map.put(first,tmpSet);
            }

            // ⭐ 추가 (양방향 연결)
            if(map.containsKey(second)){
                map.get(second).add(first);
            }else{
                Set<Integer> tmpSet2 = new HashSet<>();
                tmpSet2.add(first);
                map.put(second,tmpSet2);
            }
        }

        addCnt(1);

        System.out.println(result.size()-1);
    }

    public static void addCnt(int num){
        Set<Integer> tmp = map.get(num);
        if(tmp == null){
            return;
        }

        Iterator<Integer> iter = tmp.iterator();

        while(iter.hasNext()) {
            int a = iter.next();

            // ⭐ 방문 체크 추가
            if(result.contains(a)) continue;

            result.add(a);
            addCnt(a);
        }
    }
}
