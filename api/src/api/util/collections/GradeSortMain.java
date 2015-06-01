package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("홍길동","2011",90,80,70);
		GradeVO g2 = new GradeVO("김길동","2012",40,80,70);
		GradeVO g3 = new GradeVO("장길동","2013",40,50,70);
		GradeVO g4 = new GradeVO("문길동","2014",40,50,30);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		 * anonymous 생성자 처리 : 단 한 번만 쓰고 버리겠다.
		 */
		grades.add(new GradeVO("최길동","2015",20,30,40));
		
		System.out.println("이름 오름차순 정렬");
		Collections.sort(grades,new NameAscCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("이름 내림차순 정렬");
		Collections.sort(grades,new NameDescCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("총점 오름차순 정렬");
		Collections.sort(grades, new TotalAscCompareImple());
		for(GradeVO grade: grades){
			System.out.println(grade);
		}
		System.out.println("총점 내림차순 정렬");
		Collections.sort(grades, new TotalDescCompareImpl());
		for(GradeVO grade: grades){
			System.out.println(grade);
		}
	}
}
