public class BOJ_17269 {
    public static void main(String[] args) {

        int[] strokes = new int[] {3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1};

        String A = "LEESIYUN";
        String B = "MIYAWAKISAKURA";

        int n = 8;
        int m = 14;

        int minLen = Math.min(n, m);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < minLen; i++) {
            stringBuilder.append(A.charAt(i)).append(B.charAt(i));
        }

        stringBuilder.append(A.substring(minLen)).append(B.substring(minLen));

        int[] list = new int[stringBuilder.length()];

        for (int i = 0; i < stringBuilder.length(); i++) {
            list[i] = strokes[stringBuilder.charAt(i)-(int)'A'];
        }

        for (int i = 0; i < n+m-2; i++) {
            for (int j = 0; j < n+m-1-i; j++) {
                list[j] += list[j+1];
                list[j] %= 10;
            }
        }

        System.out.println(String.valueOf(list[0]) + String.valueOf(list[1]) + "%");
    }
}
