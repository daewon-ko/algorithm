import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int a,c,g,t;
    static char dna [];
    static int s,p;
    static int answer;
    static int [] cnt = new int[20];
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        s = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        dna = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());

        a = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        slidingWindow();
        System.out.println(answer);

    }
    static void slidingWindow(){
        for(int i =0; i<p; i++){
            cnt[dna[i]-'A']++;
        }
        check();
        for(int i = p; i<s; i++){
            cnt[dna[i-p]-'A']--;
            cnt[dna[i]-'A']++;
            check();
        }
    }

    static void check(){
        if(cnt[0]>=a && cnt[2]>=c && cnt[6]>=g && cnt[19]>=t){
            answer++;
        }
    }

}