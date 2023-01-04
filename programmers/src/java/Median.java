package java;

import java.util.Arrays;

public class Median {
    public int solution(int[] array) {
        int answer = 0;
        int middle=array.length/2;
        Arrays.sort(array);
        answer=array[middle];
        return answer;
    }
}
