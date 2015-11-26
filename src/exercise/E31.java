package exercise;
import java.util.Comparator;

//将一个数组逆序输出。
public class E31 {

	public static void main(String[] args) {
		int c[] = new int[] { 1, 2, 3, 4, 5 };
		for (int j = c.length - 1; j >= 0; j--) {
			System.out.print(c[j]);

		}

	}
}
