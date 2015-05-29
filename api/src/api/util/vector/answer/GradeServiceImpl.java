package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 * 7. �޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̴�)�� �ʿ��ѵ�, �ѱ����� ������ �÷����� �ʵ忡 �����ؾ� �ڴ�. �ʵ忡 �����ؾ�
	 * �޼ҵ���� ���� ������ �� �����ϱ�....
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	// ������ ���׸� �ȿ� VO�� ������ getter�� ���ϰ��� Ÿ������ �޾� ���δ�. 
	// (���� setter�� �ް� �ȴٸ� ����ȭ�� ����) 
	GradeVO grade = new GradeVO();

	/*
	 * 1. �л����� ������ �Է� �޴� ���ΰ�.. �׷� �Է¹޾Ƽ� ������ ������ �ʿ��ϰڴµ�... �迭�� ���� ������ �����ϴ� �����ε�
	 * �ѹ� �����ϸ� �߰��� �ø� �� ������ �������� Ȯ���ϴ� �÷����� �����ؾ߰ڱ�. �׷��� ���� ���� �ƴ� �� ���� ���̴� ���Ϳ�
	 * �־����.
	 */
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	}

	// 2. ��� �ϴ� ���ΰ�? �׷� vo ��ü�� toString() �����;���.
	@Override
	public void print() {
		System.out.println(vc.toString());
	}

	/*
	 * 3. �й����� ������ ��ȸ�ϴ� ����̱� �й��� ���� �� �л����Ը� �����ϹǷ� ���ϰ��� String ���״� ������ for loop +
	 * ���ο� if �� �غ��߰ڴ�.
	 */
	@Override
	public String searchGradeByHak(String hak) {
		// for �� �ȿ� ���������� �����ߴ���...
		// ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
		// ���� for �� ������ ���������� ���ߵȴ�.
		String msg = ""; // ���������ϱ� �ʱ�ȭ
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak�� ���Ϳ��� i ��° ��ҿ��� �й��� �����Ͽ� ���� ���� .. Ÿ���� String
			 */
			String myHak = vc.elementAt(i).getHak(); // �̺κ��� �ٽ�
			/*
			 * �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ� myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			if (hak.equalsIgnoreCase(myHak)) {
				msg = hak;
				break;
			} else {
				msg = "��ȸ�ϴ� �й��� �����ϴ�.";
			}
		}
		return msg;
	}

	/*
	 * 4. �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ���� �������� String �� ó���ϰԲ� ���� �Ǿ���. ���ϰ��� �ϳ� �� ��������
	 * for loop + if �����ۿ��� ���� ��� ��·����� ������ �װ� ��� �ڴ�.
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {

		Vector<String> local = new Vector<String>();
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak�� ���Ϳ��� i ��° ��ҿ��� �й��� �����Ͽ� ���� ���� .. Ÿ���� String
			 */
			String myName = vc.elementAt(i).getName(); // �̺κ��� �ٽ�
			/*
			 * �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ� myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			if (name.equalsIgnoreCase(myName)) {
				local.add(name);
				
			} else {
				local.add("");  
			}
		}
		return local;
	}

	/*
	 * 5. ���������ΰ����� Collections.sort ���� �ȴٴµ� ���� �׶� ó���ؾ߰ڴ�.
	 */
	@Override
	public void descGradeTotal() {

	}

	// 6. ���������̸� Arrays.sort�� ���� �ǰڱ�.
	@Override
	public void ascGradeTotal() {

	}
}
