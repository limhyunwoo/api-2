package api.lang.string;
/*
 * java.lang.String
 * toUpperCase() : �ش� ���ڿ��� ���� �빮�ڷ� ����
 * toLowerCase() : �ش� ���ڿ��� ���� �ҹ��ڷ� ��ȯ
 * valueOf() : �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ��
 */
public class ValueOf {
	public static void main(String[] args) {
		String str = "Hello Java";
		String msg;
		System.out.println("�׽�Ʈ�� ����: " + str);
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		// valueOf()�� �Ķ���� ���� int ���̴�.
		// Integer.parseInt()�� ���� �ʰ�
		// String �� ����ƽ �޼ҵ��� valueOf()
		// �� ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ�ȴ�.
		msg = String.valueOf(msg.length());
		System.out.println("valueOf �� ���: "+msg); // ���⼭ 10�� ���ڿ��� 10�� �ǹ��Ѵ�.
		
	}
}
