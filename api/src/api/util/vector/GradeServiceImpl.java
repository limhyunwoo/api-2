package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	@Override
	public void input(GradeVO vo) {

	}

	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString()���� ó���ؾ� �Ұ� ����.
	 */
	@Override
	public void print() {
		GradeVO vo = new GradeVO();
		vo.toString();
	}

	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ�
	 */
	@Override
	public String searchGradeByHak(String hak) {
	
		return null;
	}

	// �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	@Override
	public Vector<String> searchGradeByName(String name) {
		// ���ͳ� ��Ÿ �÷��� ����� �ϰԵǸ�
		// ���ͷ����� �ƴϸ� Ȯ�� for������ ó���Ѵ�.
		// �ֳĸ� Ȯ�� for���� �ε����� ������ �ʱ� ����... ������ ��ü ���
		return null;
	}

	// �������� �������� ������������ ����
	@Override
	public void descGradeTotal() {
		
	}

	// �������� �������� ������������ ����
	@Override
	public void ascGradeTotal() {
		//�Խ��� ������ �� ���� ���  
	}
}
