package api.lang.object;
/*
 * java.lang.Object �� �޼ҵ�
 * equals() : ���� ������ ���θ� üũ
 * �ν��Ͻ� ������ �ؽ��ڵ� ��(Heap�ּҰ�) �� ���ϴ� �޼ҵ�
 */
public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10); 
		Temp t2 = new Temp(10);
		//Result�� �������� �̱� ������  (main�޼ҵ� �ȿ� �־) 
		// �ݵ�� !!!! �ʱ�ȭ�� �ؾ��Ѵ� !!!!
		String result ="";
		
		/*	if(){}else{} �� ���´� �ϵ��ڵ����� �ͼ��ؾ� �Ѵ�. 
		if(t1.equals(t2)){
			System.out.println("t1�� t2�� ���� ����.");
		}else{
			System.out.println("t1�� t2�� ���� �ٸ���.");
		}
		*/
		
		/*
		 * ���׿����ڴ� if-else�� ��ü�ϴ� �����̴�.
		 * ������ 
		 * (���ǽ�) ? "���� ���" : "������ ���" ;
		 */
		result = (t1.equals(t2)) ? "t1�� t2�� ���� ����." : "t1�� t2�� ���� �ٸ���." ;
		System.out.println("�����ڸ� ���� ������ �������� ���� �� : " +result);
		
		t2 = t1;   // t2�� t1�� �ּҰ��� ������     ( clone()�� ��� ���� ���� )
		result = (t1.equals(t2)) ? "t1�� t2�� ���� ����." : "t1�� t2�� ���� �ٸ���." ;
		System.out.println("�������� ������ �Ҵ�� ���� ���� ���� ��: " +result);
		
	}
}
class Temp{
	int num;  // �ʵ忡 �ִ� �ν��Ͻ� ������ �ʱ�ȭ�� �ʿ� ����.
	public Temp(int num) {
		this.num = num;
		/* 
		 * ��� ���´� ���� ����� �ν��Ͻ� ������
		 * call Stack�� �ִ� num ���������� �Ҵ�� ����
		 * �ν��Ͻ� ������ �Ѱ��ְ� ����(����)���� �ڽ��� 
		 * ������� �ó������� ����ȴ�.
		 */
	}
}