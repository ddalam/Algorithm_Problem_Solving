import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 재귀함수로 풀어보기
 */
public class BOJ_7490 {

	public static int n = 3;

	// 3 ^ n - 1 개의 케이스가 생기고, 각 케이스에 포함된 연산자는 n-1개
	public static List<List<String>> operatorsList = new ArrayList<>();

	public static void findCase(List<String> operatorCase) {
		if (operatorCase.size() == n-1) {
			List<String> temp = new ArrayList<>();
			temp.addAll(operatorCase);
			operatorsList.add(temp);
			return;
		}
		operatorCase.add(" ");
		findCase(operatorCase);
		operatorCase.remove(operatorCase.size()-1);

		operatorCase.add("+");
		findCase(operatorCase);
		operatorCase.remove(operatorCase.size()-1);

		operatorCase.add("-");
		findCase(operatorCase);
		operatorCase.remove(operatorCase.size()-1);
	}

	public static void main(String[] args) {

		findCase(new ArrayList<String>());
	}
}
