import java.util.*;
import java.io.*;

public class bakjun_10845_silver4_chk {

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Queue <String> queue = new LinkedList<>();
        Deque <String> deque = new LinkedList<>();

        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++){
            String line = br.readLine();
            String[] tmp = line.split(" ");
            switch(tmp[0]){
                case "push": deque.add(tmp[1]); break;
                case "pop": System.out.println(deque.isEmpty()? -1 : deque.pop()); break;
                case "size": System.out.println(deque.size());break;
                case "empty": System.out.println(deque.isEmpty()? 1: 0);break;
                case "front": System.out.println(deque.isEmpty()? -1:deque.getFirst());break;
                case "back": System.out.println(deque.isEmpty()? -1: deque.getLast());break;
            }
        }
    }
}
