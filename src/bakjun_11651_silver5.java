import java.util.*;
import java.io.*;

public class bakjun_11651_silver5 {

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String countStr = bf.readLine();
        int count = Integer.parseInt(countStr);

        List<Point> pointArr = new ArrayList<>();

        for (int i = 0; i<count; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            pointArr.add(new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        Collections.sort(pointArr, (a,b) ->{
            if (a.y > b.y){
                return 1;
            }else if (a.y == b.y){
                if (a.x > b.x){
                    return 1;
                }else if(a.x == b.x){
                    return 0;
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Point s : pointArr){
            sb.append(s.x + " " +s.y + "\n");
        }

        System.out.println(sb);
    }

    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x =x;
            this.y =y;
        }
    }
}
