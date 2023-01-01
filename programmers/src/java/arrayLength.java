package java;

public class arrayLength {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int[] atom;
        for(int i=0;i<strlist.length;i++){
            answer[i]=strlist[i].length();
        }
        return answer;
    }
}
