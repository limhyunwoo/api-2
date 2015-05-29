package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	@Override
	public void input(GradeVO vo) {

	}

	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString()으로 처리해야 할거 같음.
	 */
	@Override
	public void print() {
		GradeVO vo = new GradeVO();
		vo.toString();
	}

	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 */
	@Override
	public String searchGradeByHak(String hak) {
	
		return null;
	}

	// 이름으로 성적을 검색해서 출력하는 메소드
	@Override
	public Vector<String> searchGradeByName(String name) {
		// 벡터나 기타 컬렉션 출력을 하게되면
		// 이터레이터 아니면 확장 for문으로 처리한다.
		// 왜냐면 확장 for문을 인덱스를 따지지 않기 때문... 무조건 전체 출력
		return null;
	}

	// 종합점수 기준으로 내림차순으로 정렬
	@Override
	public void descGradeTotal() {
		
	}

	// 종합점수 기준으로 오름차순으로 정렬
	@Override
	public void ascGradeTotal() {
		//게시판 순서할 때 많이 사용  
	}
}
