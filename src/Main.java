import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int s;
    static int p;
    static int answer;
    static char [] dna;
    static int a,c,g,t;
    static int [] cnt = new int[20];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        s = Integer.parseInt(stringTokenizer.nextToken());
        p = Integer.parseInt(stringTokenizer.nextToken());

        dna = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        a = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());
        g = Integer.parseInt(stringTokenizer.nextToken());
        t = Integer.parseInt(stringTokenizer.nextToken());

        slingWindows();
        System.out.println(answer);

    }
    public static void slingWindows(){

        for(int i = 0; i<p; i++){
            cnt[dna[i]-'A']++;
        }
        check();
        for(int i=p; i<s; i++){
            cnt[dna[i-p]-'A']--;
            cnt[dna[i]-'A']++;
            check();
        }

    }

    //0 2 6 19
    static void check(){
        if(cnt[0]>=a && cnt[2]>=c && cnt[6]>=g && cnt[19]>=t){
            answer++;
        }
    }
}
