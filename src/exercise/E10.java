package exercise;

//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
//�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�
public class E10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double sum = 0;// ����
		double h = 100;// �߶�
		for (int i = 0; i < 10; i++) {
			sum += h;
			h = h / 2;
		}
		System.out.println("������: "+sum+"��");
		System.out.println("�߶ȣ�"+h+"��");
	}
}
