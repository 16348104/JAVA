package exercise;
import java.util.Scanner;

//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ����������
//����6=1��2��3.��� �ҳ�1000���ڵ�����������
public class E9 {

	public static void main(String[] args) {
		int m,i,s;
		 for(m=1;m<=1000;m++) //��1��ʼ��1000ѭ������
		 {
		  s=0;//��ʼ������֮��sΪ0

		  for(i=1;i<m;i++) //Ѱ����1��m֮�䣬�ж���m������
		   if(m%i==0) //���m������i����iΪm������
		    s=s+i;//�������ۼ�

		  if(s==m) //�������֮�͵��������
			  System.out.print(" "+s); //���
		 }

		     }

	}


