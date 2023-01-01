package java;

public class coffee {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int leave = money - 5500;
        int n = money / 5500;
        if (money % 5500 == 0) {
            answer[0] = n;
            answer[1] = 0;

        } else {
            answer[0] = n;
            answer[1] = money - (n * 5500);
        }
        return answer;
    }
}
