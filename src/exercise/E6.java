package exercise;
import java.util.Scanner;
//��������������m��n���������Լ������С��������
public class E6 {

	public static void main(String[] args) {
		int n, m,r,m1,n1;
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ������(m>0):  ");
		 m1=scan.nextInt();
		 System.out.println("������һ������(n>0):  ");
		 n1=scan.nextInt();
		 if(m1>n1)
		 {
			 m=m1;
			 n=n1;
		 }
		 else
		 {
			 m=n1;
			 n=m1;
		 }
		 do{
			 r=m%n;
			 m=n;
			 n=r;
		 }while(r!=0);
			 System.out.println(m1+"��"+n1+"�����Լ��= "+m+",��С������="+m1*n1/m);
	}

}
