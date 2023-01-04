package java;

public class RepeatString {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] munja=my_string.toCharArray();

        for(int i=0;i<munja.length;i++){
            for(int j=0;j<n;j++)
                answer+=munja[i];
        }
        return answer;
    }
}
