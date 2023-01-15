package java;

public class DeleteVowel {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
