package stack;

import java.io.*;
import java.util.*;

public class bakjun_1874_silver2_chk {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        int pointer = 0;     // 현재 만들어야 할 수열 인덱스
        int nextPush = 1;   // 다음에 push 가능한 숫자 (핵심)

        while (pointer < n) {

            // 아직 원하는 숫자까지 push 안 했다면 push
            if (nextPush <= arr[pointer]) {
                stack.push(nextPush);
                sb.append("+\n");
                nextPush++;
            }
            // 스택 top이 원하는 숫자면 pop
            else if (!stack.isEmpty() && stack.peek() == arr[pointer]) {
                stack.pop();
                sb.append("-\n");
                pointer++;
            }
            // 둘 다 아니면 불가능
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb.toString());
    }
}
