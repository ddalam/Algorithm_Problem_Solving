public class LeetCode_ClimbingStairs {

    // LeetCode Solution 1 - Brute Force
    public static int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }

        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }
    // LeetCode Solution 1 - Brute Force  == end

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
