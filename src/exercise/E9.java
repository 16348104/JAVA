package exercise;
import java.util.Scanner;

//一个数如果恰好等于它的因子之和，这个数就称为’完数’。
//例如6=1＋2＋3.编程 找出1000以内的所有完数。
public class E9 {

	public static void main(String[] args) {
		int m,i,s;
		 for(m=1;m<=1000;m++) //从1开始到1000循环结束
		 {
		  s=0;//初始化因子之和s为0

		  for(i=1;i<m;i++) //寻找在1到m之间，有多少m的因子
		   if(m%i==0) //如果m能整除i，则i为m的因子
		    s=s+i;//将因子累加

		  if(s==m) //如果因子之和等于这个数
			  System.out.print(" "+s); //输出
		 }

		     }

	}


