package java;

public class Ant {
    public int solution(int hp) {
        int answer=hp/5+hp%5/3+hp%5%3;
        return answer;
    }
}
