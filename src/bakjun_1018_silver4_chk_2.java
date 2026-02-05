import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjun_1018_silver4_chk_2 {

    static char[][] board;
    static int N, M;

    // W로 시작하는 체스판
    static final String[] patternW = {
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
    };

    // B로 시작하는 체스판
    static final String[] patternB = {
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
    };

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

        // 8x8 시작 위치 전부 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                answer = Math.min(answer, calc(i, j));
            }
        }

        System.out.println(answer);
    }

    // 패턴과 비교해서 최소 변경 횟수 계산
    static int calc(int startY, int startX) {

        int countW = 0;
        int countB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[startY + i][startX + j];

                if (current != patternW[i].charAt(j)) {
                    countW++;
                }
                if (current != patternB[i].charAt(j)) {
                    countB++;
                }
            }
        }

        return Math.min(countW, countB);
    }
}
