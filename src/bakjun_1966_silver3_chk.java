import java.util.*;
import java.io.*;

public class bakjun_1966_silver3_chk {

    static class Doc {
        int priority;
        boolean isTarget;

        Doc(int priority, boolean isTarget) {
            this.priority = priority;
            this.isTarget = isTarget;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<Doc> q = new LinkedList<>();
            st = new StringTokenizer(bf.readLine());

            for (int j = 0; j < n; j++) {
                int p = Integer.parseInt(st.nextToken());
                q.add(new Doc(p, j == m));
            }

            int count = 0;

            while (true) {
                Doc cur = q.poll();

                boolean hasHigher = false;
                for (Doc d : q) {
                    if (d.priority > cur.priority) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    q.add(cur);
                } else {
                    count++;
                    if (cur.isTarget) {
                        sb.append(count).append('\n');
                        break;
                    }
                }
            }
        }

        System.out.print(sb);
    }
}
