package api.util.vector;

import java.util.Vector;

/*
 java.util.Vector 메소드
 addElement() : 기본적으로 add() 와 동일하다.
 addElemnet()를 권장함..
 */
public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hulk","hawk"};
		Vector<String> avengers = new Vector<String>();
		// 벡터에 배열의 요소를 저장 addElement() 
		for(int i=0; i<heros.length;i++){
			avengers.addElement(heros[i]);
		}
		// 토르가 존재하는지 체크 contains()를 사용한다.
		// 검색할 때 contains를 사용한다.
		String thor = "thor";
		if(avengers.contains(thor)){   
			int idx = avengers.indexOf(thor);  // 검색용으로 사용..
			System.out.println("토르는 "+idx+" 번째 있습니다.");
		}else{
			System.out.println("토르는 없습니다.");
		}
		/*
		 * 첫번째 멤버(요소) 삭제 
		 * 벡터의 인덱스도 0부터 시작한다.
		 * 0 이 곧 첫번째 요소이다.
		 */
		avengers.removeElementAt(0);
		System.out.println("삭제 후 멤버 위치 인데스 변화");
		for(int j=0; j<avengers.size();j++){
			System.out.println("Avengers의 " +(j+1)+"번째 멤버는 "+avengers.elementAt(j) );
		}  // 0 번째 인덱스인 iron 이 삭제됨
	}
}
