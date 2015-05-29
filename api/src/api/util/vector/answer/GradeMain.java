package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// 일일이 setter 만들기가 귀찮다.
		// 생성자로 한번에 만든다.
		// 아래처럼 더미값 생성.. 나중에 없앨것.
		GradeVO g1 = new GradeVO("홍길동","1111",70,80,90);
		GradeVO g2 = new GradeVO("김길동","2222",75,81,40);
		GradeVO g3 = new GradeVO("김길동","3333",15,21,30);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.print();
		// 성적표 [학번=, 이름=, 국어=0, 영어=0, 수학=0] 나온다.
		// 결과를 보니까 grade를 출력하지만 백터에 들어있는게 아니라 
		// null 값이 들어가 있다.
		// 벡터에 있는 grade를 가져와야 한다.
		// grade 대신에 vc.toString() 해야겠다.
		
		String dummy = service.searchGradeByHak("3333");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("김길동");
		System.out.println(temp.toString());
		
		
	}
}
