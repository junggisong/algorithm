import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjun_1018_silver4_chk_1 {

    static char[][] board;
    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 행
        M = Integer.parseInt(st.nextToken()); // 열

        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        // 8x8 시작 위치 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                answer = Math.min(answer, calc(i, j));
            }
        }

        System.out.println(answer);
    }

    // (startY, startX)를 왼쪽 위로 하는 8x8 체스판 최소 변경 횟수
    static int calc(int startY, int startX) {

        int countW = 0; // 왼쪽 위가 W인 경우
        int countB = 0; // 왼쪽 위가 B인 경우

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                char current = board[startY + i][startX + j];

                // (i + j) 짝/홀로 기대 색 결정
                if ((i + j) % 2 == 0) {
                    if (current != 'W') countW++;
                    if (current != 'B') countB++;
                } else {
                    if (current != 'B') countW++;
                    if (current != 'W') countB++;
                }
            }
        }

        return Math.min(countW, countB);
    }
}
