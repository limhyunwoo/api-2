package api.util.vector.answer;

import java.util.Vector;

public interface GradeService {
	// vo ��ü�� ���Ϳ� �����ϴ� ���
	public void input(GradeVO vo); 
	public void print();
	// �й��� �̿��ؼ� ����ǥ�� ���
	String searchGradeByHak(String hak);
	// �̸��� �̿��� ����ǥ ��� (������ ���̽����� Ŀ���ϱ� ����
	// ���ϰ��� ���ͷ� �޴´�.)
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
