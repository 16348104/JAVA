package exercise;

//对10个数进行排序
public class E28 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("原数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i]);
		}
		System.out.println();
		int len = a.length;
		for (int i = 0; i < len / 2; i++) {
			 int tem = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length-i-1]=tem;
		}
		System.out.println("倒序数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
