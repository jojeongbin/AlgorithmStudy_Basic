package java;
import java.util.Arrays;
import java.util.stream.Stream;
public class FindNumber {
        public int solution(int num, int k) {
            int answer = 0;
            int[] array = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
            for (int i=0;i<array.length;i++){
                if(array[i]==k){
                    answer=i+1;
                    break;
                }

                answer=-1;
            }
            return answer;
        }
    }

