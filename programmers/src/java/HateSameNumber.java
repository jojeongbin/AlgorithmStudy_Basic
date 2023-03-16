package java;
import java.util.*;

public class HateSameNumber {
        public int[] solution(int []arr) {
            ArrayList<Integer> answer=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==arr[i+1]){
                    answer.add(arr[i]);
                }
            }
            int[] arr1 = new int[answer.size()];
            for (int i = 0 ; i < answer.size() ; i++)
                arr1[i] = answer.get(i).intValue();

            return arr1;
        }
    }

