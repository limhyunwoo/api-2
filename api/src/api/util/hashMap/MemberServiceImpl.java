package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{

	/*
	 * ȸ������ ����� �ϴ� �޼ҵ� 
	 * HashMap �� �ؾ� id ���� ������ password�� ȣ�� �ϰڴ�.
	 */
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String, Object>();  //�����ڷ��� �迭..
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 * �� ������ DB�� �����ϴ� ���ϰ� �����ϴ�.
		 * ��, ���� Ȱ���ϸ鼭 �����ǰų� ������ �� �ֱ⿡
		 * ���� ���� �������� DB�� �����Ѵ�.
		 */
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		// ȸ�������� ���⼭ ����
		
		/*
		 * 1. ù��° ��������
		 * map.put(vo.getId(), vo.getPassword());
		 */
		
		// �α��� �ϸ鼭 ����ϱ� ���ؼ� map�� ���
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// Ű�� ��� ���Ͽ��� ������� String ���� ���Ͻ�Ű����
		// int Ÿ������ ���� age�� String Ÿ������ ��ȯ�Ͽ���.
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
		/*
		 * 2. �ι�° ��������
		 * map.put("age", vo.getAge());   ValueOf�� �ؾ���.
		 */
	}
	
	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ� ���Ŀ�
	 * ���ٸ� ���� ���� �����ϱ�..
	 * �α��� ����, ���� �޽������� ���⿡�� ��������� ��.
	 */
	@Override
	public void login(String id, String password) {
		/*
		 * 3. ����° ���� ����
		 * map.get(id) => �Ķ���� ������ �ݵ�� String ���� �ؾ���.
		 */
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			System.out.println("ȯ���մϴ�. "+vo.getAddr() +"�� ��� "+ vo.getAge()+"�� "+vo.getName()+"��");
		}else if(!(map.get("id").equals(id) && map.get("password").equals(password))){
			System.out.println("�Է��Ͻ� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
		}else{
			System.out.println("����� �ٸ��ϴ�. �ٽ��Է��ϼ���.");
		}
	}
}
