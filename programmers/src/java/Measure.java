package java;
import java.util.*;

class Measure {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}