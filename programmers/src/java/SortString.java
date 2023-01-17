package java;

import java.util.Arrays;

public class SortString {
    public int[] solution(String my_string) {
        String number=my_string.replaceAll("[^0-9]","");
        int[] answer= Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
