package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("ȫ�浿","2011",90,80,70);
		GradeVO g2 = new GradeVO("��浿","2012",40,80,70);
		GradeVO g3 = new GradeVO("��浿","2013",40,50,70);
		GradeVO g4 = new GradeVO("���浿","2014",40,50,30);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		 * anonymous ������ ó�� : �� �� ���� ���� �����ڴ�.
		 */
		grades.add(new GradeVO("�ֱ浿","2015",20,30,40));
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grades,new NameAscCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("�̸� �������� ����");
		Collections.sort(grades,new NameDescCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalAscCompareImple());
		for(GradeVO grade: grades){
			System.out.println(grade);
		}
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalDescCompareImpl());
		for(GradeVO grade: grades){
			System.out.println(grade);
		}
	}
}
