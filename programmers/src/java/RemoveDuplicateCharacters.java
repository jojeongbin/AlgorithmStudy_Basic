package java;

public class RemoveDuplicateNumbers {
    public String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++) {
            // System.out.println(str.charAt(i)+" "+i+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }
}
