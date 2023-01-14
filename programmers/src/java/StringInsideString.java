package java;

public class StringInsideString {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean include=str1.contains(str2);
        if(include==true){
            answer=1;
        }
        else{
            answer=2;
        }
        return answer;
    }
}
