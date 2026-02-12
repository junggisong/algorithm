import java.util.*;
import java.io.*;

public class bakjun_2164_silver4 {

    public static void main(String[]args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        Queue<Integer> card = new LinkedList<>();
        for (int i=1; i<=count; i++){
            card.add(i);
        }

        while(card.size() > 1){
            card.poll();
            int tmp = card.poll();
            card.add(tmp);
        }
        System.out.println(card.poll());

    }

//    public static void main(String[]args) throws IOException{
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        int count = Integer.parseInt(bf.readLine());
//        List<Integer> card = new ArrayList<>();
//        for (int i=1; i<=count; i++){
//            card.add(i);
//        }
//
//        while(true){
//            if (card.size() == 2){
//                System.out.println(card.get(1));
//                break;
//            }
//            int tmp = card.get(1);
//            card.remove(0);
//            card.remove(1);
//            card.add(tmp);
//        }
//
//    }
}
