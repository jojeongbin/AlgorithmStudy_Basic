package java;

public class ArraySimilarity {
    public int solution(String[] s1, String[] s2) {
        //int a_length = 0;
        //int b_length = 0;
        int answer = 0;
        /*if (s1.length > s2.length) {
            a_length = s1.length;
            b_length = s2.length;
        } else {
            a_length = s2.length;
            b_length = s1.length;
        }
        */

        for (int i = 0; i <s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }

        }

        return answer;
    }
}
