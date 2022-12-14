import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arrayList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            if (i == 2 || i == 3) {
                arrayList.add(i);
            }
            for (int k = 2; k <= (int) Math.sqrt(i); k++) {
                if (i % k == 0) {
                    break;
                } else if(k==(int) Math.sqrt(i)){
                    arrayList.add(i);
                }
            }
        }

        for (int j = 0; j < arrayList.size(); j++) {
            bw.write(String.valueOf(arrayList.get(j))+"\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}


