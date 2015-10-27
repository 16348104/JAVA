package exercise;

//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class E10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double sum = 0;// 距离
		double h = 100;// 高度
		for (int i = 0; i < 10; i++) {
			sum += h;
			h = h / 2;
		}
		System.out.println("经过了: "+sum+"米");
		System.out.println("高度："+h+"米");
	}
}
