import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int count = 0;
        String line = br.readLine();
        String [] a = line.split(" ");
        for (int i =0; i<a.length; i++){
            int temp = Integer.parseInt(a[i]);
            if (temp == 1){
                continue;
            }
            boolean chk = true;
            for (int k=2; k<temp; k++){
                if (temp%k == 0){
                    chk = false;
                }
            }
            if (chk){
                count++;
            }
        }

        System.out.println(count);
    }
}