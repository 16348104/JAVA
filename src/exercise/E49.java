package exercise;

//计算字符串中子串出现的次数。
public class E49 {

	public static void main(String[] args) {
		String str1 = new String("lenovo");
		String str2 = new String("o");
		int len=str1.length();
		int count=0;
        for(int i=0;i<len;i++){
        	int j=str1.indexOf(str2);
        	if(j==-1)
        	{
        		continue;
        	}
        	else{
        		count++;
        	}
        	String s=str1.substring(j+1, len);
        }
        System.out.println(count);
        }
	}


