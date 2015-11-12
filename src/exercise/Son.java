package exercise;

public class Son extends Father {
       public void m1(){
//    	   super.m();
       }
	public void m() {
		super.m();
		System.out.println("Son...");
	}
	public static void main(String[] args) {

         Son s=new Son();
         s.m1();
         s.m();
         Father f=new Son();
         f.m();
	}

}
