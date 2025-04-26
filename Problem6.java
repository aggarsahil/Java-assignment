public class Problem6 {
    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }

    public static String stringWithMostVowels(String[] words) {
        String result = "";
        int max = -1;
        for (String word : words) {
            int vowels = countVowels(word);
            if (vowels > max) {
                max = vowels;
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        System.out.println(stringWithMostVowels(words));
    }
}