/**
 * 재귀함수로 풀기
 */
public class BOJ_1074 {

    public static int result = 0;
    public static int size = 2;
    public static int X = 3;
    public static int Y = 1;

    public static void solution(int n, int x, int y) {
        // 현재 확인하는게 크기가 2라면 -> Z 를 그리는 순서로 x, y 좌표 값이 요청된 좌표값인지 확인
        if (n == 2) {
            if (x == X && y == Y) {
                System.out.println(result);
                return;
            }

            result++;

            if (x == X && y + 1 == Y) {
                System.out.println(result);
                return;
            }

            result++;

            if (x + 1 == X && y == Y) {
                System.out.println(result);
                return;
            }

            result++;

            if (x + 1 == X && y + 1 == Y) {
                System.out.println(result);
                return;
            }

            result++;

            return;
        }
        // n이 2가 아니면 어떤 크기든 항상 4등분
        // 4등분의 첫번째 영역은 -> n의 절반 크기, 시작 좌표는 x, y
        solution(n / 2, x, y);
        // 4등분의 두번째 영역은 -> n의 절반 크기, 시작 좌표는 x, y + n / 2(n의 절반만큼 옆으로 이동하기)
        solution(n / 2, x, y + n / 2);
        // 4등분의 세번째 영역은
        solution(n / 2, x + n / 2, y);
        // 4등분의 네번째 영역은
        solution(n / 2, x + n / 2, y + n / 2);
    }

    public static void main(String[] args) {

        solution((int)Math.pow(2, size), 0, 0);
    }
}
