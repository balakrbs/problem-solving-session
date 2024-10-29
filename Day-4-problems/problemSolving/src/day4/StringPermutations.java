package day4;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        findPermutations(str, "");
    }

    static void findPermutations(String str, String perm) {
        if (str.isEmpty()) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            findPermutations(remaining, perm + ch);
        }
    }
}
