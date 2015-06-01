package api.util.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO>{

	/*
	 * 이름으로 오름차순 정렬
	 * ㄱ,ㄴ,ㄷ,ㄹ,...
	 * a,b,c,...
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return first.getName().compareTo(second.getName());
		/*
		 * 뒤에 파라미터에 있는 앞 글자와 비교해서
		 * 가나다 순이라면 가 부터 리턴하라. 
		 */
	}

}
