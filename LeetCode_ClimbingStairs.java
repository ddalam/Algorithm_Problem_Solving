public class LeetCode_ClimbingStairs {

    // LeetCode Solution 1 - Brute Force
    // 시간 복잡도 : O(n^2) 1개의 경우에 +1, +2 2개씩
    // 공간 복잡도 : O(n) 재귀 트리의 깊이는 n까지
    public static int climbStairs_1(int n) {
        return climb_Stairs_1(0, n);
    }
    public static int climb_Stairs_1(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }

        return climb_Stairs_1(i + 1, n) + climb_Stairs_1(i + 2, n);
    }
    // 이 방법은 계산 과정에서 중복된 결과를 확인하는 단계가 생긴다
    // LeetCode Solution 1 - Brute Force ==> end

    // LeetCode Solution 2 - Recursion with Memoization
    // 시간 복잡도 : O(n) 재귀 트리의 크기를 n개로 줄일 수 있음
    // 공간 복잡도 : O(n) 재귀 트리의 깊이는 n까지
    public static int climbStairs_2(int n) {
        int memo[] = new int[n + 1];    // i
        return climb_Stairs_2(0, n, memo);
    }
    public static int climb_Stairs_2(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs_2(i + 1, n, memo) + climb_Stairs_2(i + 2, n, memo);
        return memo[i];
    }
    // LeetCode Solution 2 - Recursion with Memoization ==> end

    public static void main(String[] args) {
        System.out.println(climbStairs_1(5));
    }
}
