package java;
import java.util.Arrays;
public class RacePlayerHash2 {

        public String solution(String[] participant, String[] completion) {

            Arrays.sort(participant);
            Arrays.sort(completion);

            int i=0;
            for(;i<completion.length;i++)
                if(!participant[i].equals(completion[i]))
                    break;
            return participant[i];

        }
    }
