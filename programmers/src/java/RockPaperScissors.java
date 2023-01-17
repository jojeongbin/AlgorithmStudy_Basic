package java;

public class RockPaperScissors {
    public String solution(String rsp) {
        String[] array=rsp.split("");
        String answer = "";
        for(int i=0;i<rsp.length();i++){
            if(Integer.parseInt(array[i])==2){
                answer+=0;
            }
            else if(Integer.parseInt(array[i])==0){
                answer+=5;
            }
            else if(Integer.parseInt(array[i])==5){
                answer+=2;
            }
        }
        return answer;
    }
}
