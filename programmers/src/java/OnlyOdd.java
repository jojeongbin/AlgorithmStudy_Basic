package java;

public class OnlyOdd {
    public int[] solution(int n) {
        int[] answer=new int[(n % 2==0) ? n/2 : n/2+1];
        int k=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                answer[k]+=i+1;
                k++;
            }
        }

        return answer;
    }
}
