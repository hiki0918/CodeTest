package result.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer , Integer> map = new HashMap<Integer, Integer>();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        while (N-->0){
            int x = Integer.parseInt(stringTokenizer.nextToken());
            if(map.containsKey(x)){
                map.put(x , map.get(x)+1);
            }
            else {
                map.put(x, 1);
            }
        }
        Integer y = map.get(Integer.parseInt(br.readLine()));
        System.out.println(y == null ? 0 : y);
    }
}
