public class BOJ_17389 {

    public static void main(String[] args) {
        int n = 8;
        String s = "XOOOXOOX";

        int score = 0;
        int bonus = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'O') {
                score = score + (i + 1) + bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }

        System.out.println(score);
    }
}
