import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int [] A = new int [N];

        for(int i =0; i<N; i++){
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(A);
        int i = 0;
        int j = N-1;
        int count = 0;

        while (i<j){
            if(A[i]+A[j]<M){
                i++;
            }else if(A[i]+A[j]>M){
                j--;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        bufferedReader.close();



    }
}