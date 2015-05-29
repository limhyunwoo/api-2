package api.util.vector.answer;

import java.util.Vector;

public interface GradeService {
	// vo 객체를 벡터에 저장하는 기능
	public void input(GradeVO vo); 
	public void print();
	// 학번을 이용해서 성적표를 출력
	String searchGradeByHak(String hak);
	// 이름을 이용한 성적표 출력 (동일인 케이스까지 커버하기 위해
	// 리턴값을 벡터로 받는다.)
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
