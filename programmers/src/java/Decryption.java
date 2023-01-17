package java;
import java.util.*;

public class Decryption {
    public String solution(String cipher, int code) {
        String answer = "";
        String [] array =cipher.split("");

        for(int i=0;i<cipher.length();i++){
            if((i+1)%code==0){
                answer+=array[i];
            }
        }
        return answer;
    }
}
