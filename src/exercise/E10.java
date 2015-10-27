package exercise;

//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class E10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum = 0;
		int h = 100;
		for (int i = 0; i < 10; i++) {
			h = h / 2;
			sum +=h;
		}
		System.out.print(sum);
	}
}
