package java;

import java.util.ArrayList;

public class SelectMultipleOfN {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList answer=new ArrayList();
        for(int i=0;i< numlist.length;i++){
            if(numlist[i]%n==0){
                answer.add(numlist[i]);
            }
        }

        return answer;
    }
}
