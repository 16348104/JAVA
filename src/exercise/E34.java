//�������[1�� 20]��10000�Σ�ʹ�����ַ���ʵ�֣�java.lang.Math��java.util.Random����
//���ж����ַ�����Ч�ʺͷֲ���
package exercise;

import java.util.Random;

public class E34 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
           for(int i=0; i<1000; i++){
             int a;
        	 a=(int)(1+Math.random()*20);

        	  System.out.print(a+"  ");
           }
           System.out.println();
           System.out.println("-------------------------------------------------------------------------"+"����һ�ַ���"+"---------------------------------------------------------------------");
           for (int j = 0; j < 1000; j++) {

               Random r = new Random();
               int b=r.nextInt(20)+1;
           System.out.print(b+" ");

           }
	}
}

