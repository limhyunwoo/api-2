package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// ������ setter ����Ⱑ ������.
		// �����ڷ� �ѹ��� �����.
		// �Ʒ�ó�� ���̰� ����.. ���߿� ���ٰ�.
		GradeVO g1 = new GradeVO("ȫ�浿","1111",70,80,90);
		GradeVO g2 = new GradeVO("��浿","2222",75,81,40);
		GradeVO g3 = new GradeVO("��浿","3333",15,21,30);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.print();
		// ����ǥ [�й�=, �̸�=, ����=0, ����=0, ����=0] ���´�.
		// ����� ���ϱ� grade�� ��������� ���Ϳ� ����ִ°� �ƴ϶� 
		// null ���� �� �ִ�.
		// ���Ϳ� �ִ� grade�� �����;� �Ѵ�.
		// grade ��ſ� vc.toString() �ؾ߰ڴ�.
		
		String dummy = service.searchGradeByHak("3333");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("��浿");
		System.out.println(temp.toString());
		
		
	}
}
