package api.lang.thread;

/*
 run() 을 호출하는 것은 클래스 내부의 메소드 호출
 start()을 호출하는 것은 스레드가 작업을 실행하는데
 필요한 호출스택(call stack)을 생성한 다음, run() 을
 호출해서, 생성된 호출스택에 run()을 저장시킨다.
 즉, 스레드를 구현한 클래스는 start()를 통해 시작해야 한다.
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImple();
		/* 생성자 Thread(Runnable r)*/
		Thread thr = new Thread(r);  // <- r이 들어간다.  .. SCJP시험때 당골문제
		thr.start();
	}
}

class RunnableImple implements Runnable{  // 다중상속이 안되기 때문에 인터페이스 Runnable을 사용한다.

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			/*
			 * 상속이 아니기때문에 super를 사용할 수 없다.
			 * 따라서 메소드체인을 통해 getName을 호출하였다.
			 * 또한 Thread.currentThread()의 리턴값이
			 * String 이 아니라 Thread 인스턴스 객체 임이 확실하다.
			 */
			System.out.println(Thread.currentThread().getName());
		}
	}
}
