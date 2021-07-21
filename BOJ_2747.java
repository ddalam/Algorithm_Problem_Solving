/**
 * 피보나치 수 - 단순 반복문으로 풀기
 */
public class BOJ_2747 {

    public static void main(String[] args) {
        int n = 17;

        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n+1; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }

        System.out.println(fibonacci[n]);
    }
}
