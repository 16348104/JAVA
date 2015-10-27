//随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），
//并判断两种方法的效率和分布。
package exercise;

import java.util.Random;

public class E34 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
           for(int i=0; i<1000; i++){
             int a;
        	 a=(int)(1+Math.random()*20);

        	  System.out.print(a+"  ");
           }
           System.out.println();
           System.out.println("-------------------------------------------------------------------------"+"另外一种方法"+"---------------------------------------------------------------------");
           for (int j = 0; j < 1000; j++) {

               Random r = new Random();
               int b=r.nextInt(20)+1;
           System.out.print(b+" ");

           }
	}
}

