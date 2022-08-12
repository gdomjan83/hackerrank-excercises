package splitstrings;

//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace
// the missing second character of the final pair with an underscore ('_').

public class StringSplit {
    public String[] solution(String s) {
        String input = s.length() % 2 == 0 ? s : s.concat("_");
        String[] result = new String[input.length() / 2];
        for (int i = 0; i < input.length() - 1; i += 2) {
            result[i / 2] = input.substring(i, i + 2);
        }
        return result;
    }
}
