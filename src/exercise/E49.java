package exercise;

//计算字符串中子串出现的次数。
public class E49 {

	public static void main(String[] args) {
		String s1 = "lenovo";
		String s2 = "o";
		int len1=s1.length();
		int len2 = s2.length();
		int count = 0;
		int start=0;
		for (int i = 0; i <len1 ; i++) {
			int size = s1.indexOf(s2,start);
            start=size+len2;
            if(size>0&&start<len1)
            {
            	count++;
            }
		}

		System.out.println("字符串"+s1+"中"+"子串"+s2+"出现的次数为"+count);
	}
}
