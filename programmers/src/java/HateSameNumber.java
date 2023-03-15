package java;
import java.util.*;

public class HateSameNumber {
        public int[] solution(int []arr) {
            int[] answer = {};
            for(int i=0;i<arr.length;i++){
                if(arr[i]==arr[i+1]){
                    answer[i]=arr[i];
                }
            }

            return answer;
        }
    }

