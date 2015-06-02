package api.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		ThreadExtends thr = new ThreadExtends();
		/*
		 * 스레드를 잘 모르는 상황에서는
		 * 아래 호출 메소드를 run() 이라고 하기 쉽다.
		 * 꼭!!! 주의...
		 * 반드시 호출은 start() 를 통해서 해야한다.
		 * 그러면 내부적으로 run() 을 포함한
		 * 여러가지 콜백 메소드를 호출하게 된다.
		 */
		thr.start();
	}
}
class ThreadExtends extends Thread{
	//스레드를 상속 받을 시 자동 생성법
	// CTRL + space + r
	@Override
	public void run() {
		for(int i = 0; i<5; i++){
			
			/*
			 * getName()은 이 클래스의 부모인
			 * Thread가 가지고 있는 메소드이다.
			 * 부모의 메소드를 오버라이딩 없이
			 * 바로 사용하려고 super. 이라고 호출했다.
			 */
			System.out.println(super.getName());
		}
	}
}