package exercise;

public class Son extends Father {
       public void m1(){
//    	   super.m();
       }

	/* （非 Javadoc）
	 * @see exercise.Father#m()
	 */
	public void m() {
		// TODO 自动生成的方法存根
		super.m();
		System.out.println("Son...");
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         Son s=new Son();
         s.m1();
         s.m();
         Father f=new Son();
         f.m();
	}

}
