package exercise;
import java.util.Scanner;
//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
public class E7 {

	public static void main(String[] args) {
		System.out.println("������һ���ַ�: ");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int other=0;             //����
		int digit=0;              //����
		int space=0;            //�ո�
		int character=0;      //��ĸ
		int chinese=0;            //����
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<'9'){
				 digit++;              //�ж�����
			}else if((s.charAt(i)>='a'&&s.charAt(i)<'z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
				 character++;      //�ж�Ӣ��
			}else if (s.charAt(i)>='\u4e00' && s.charAt(i)<='\u9fa5') {
				chinese++;             //�ж�����
			}else if(s.charAt(i)==' '){
				 space++;           //�жϿո�
			}else{
					 other++;        //�ж�����
				}
		}
              System.out.println("���֣�"+digit+'��');
              System.out.println("Ӣ�ģ�"+character+'��');
              System.out.println("���ģ�"+chinese+'��');
              System.out.println("�ո�"+ space+'��');
              System.out.println("������"+ other+'��');
	}

}
