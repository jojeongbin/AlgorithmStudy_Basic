package java;

public class evenSum {
    public int solution(int n) {
        int answer = 0;
        for(int a=0;a<=n;a++){
            if(a%2==0){
                answer+=a;
            }
        }

        return answer;
    }
}
