package api.util.hashMap;

public interface MemberService {
	
	/*
	 * ȸ������ ����� �ϴ� �޼ҵ�
	 * HashMap�� �ؾ� id ���� ������ password�� ȣ�� �ϰ� �ȴ�.
	 */
	public void join(String id, String password, String name, int age, String addr);
	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ�
	 * ���ٸ� ���� ���� 
	 */
	
	// ��¹� ����
			// �Է��Ͻ� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.
			// ����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.
			// ȯ���մϴ�. ����ÿ� ��� 20��ȫ�浿��...
			
	public void login(String id, String password);
}
