package exercise;

//利用递归方法求5!。
public class E22 {
	int fun(int n) {
		if (n == 1)
			return 1;

		return fun(n - 1) * n;
	}

	public static void main(String[] args) {
		E22 e = new E22();
		System.out.println(e.fun(5));

	}

}
