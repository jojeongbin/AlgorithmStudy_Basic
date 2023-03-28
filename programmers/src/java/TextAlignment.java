package java;

import java.util.*;

public class TextAlignment {
    public String solution(String my_string) {
        String answer = "";
        String[] arry = my_string.toLowerCase().split("");

        Arrays.sort(arry);

        for(int i = 0; i<arry.length; i++){
            answer += arry[i];
        }
        return answer;
    }

}
