package java;
import java.lang.Math;

public class Power {
    public double solution(int n, int t) {
        double answer=0;
        double x=Math.pow(2,t);
        answer=n*x;

        return answer;
    }
}
