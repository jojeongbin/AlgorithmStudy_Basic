package java;
import java.lang.*;



public class SquareRoot {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            double root= Math.sqrt(n);
            if(root%1==0){
                answer=1;
            }
            else{
                answer=2;
            }

            return answer;
        }
    }
}
