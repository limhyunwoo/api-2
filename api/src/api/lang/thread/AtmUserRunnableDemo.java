package api.lang.thread;

public class AtmUserRunnableDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		// 스레드 객체
		Runnable hong = new AtmUser(atm, "홍길동");
		Runnable kim = new AtmUser(atm, "김길동");
		Runnable moon = new AtmUser(atm, "문길동");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		
		Thread thr2 = new Thread(moon);
		thr2.start();
		
		Thread thr3 = new Thread(kim);
		thr3.start();
	}
}

class Atm{
	public synchronized void inchul(String name){  // 동기화 == Lock
		System.out.println(name+ "님이 인출요청함");
		for(int i=0; i<= 100000000;i++){
			if(i==10000){
				System.out.println(name + " 님 인출중..");
			}
		}
		System.out.println(name + " 인출해 나감");
	}
}
class AtmUser implements Runnable{
	Atm atm;
	String name;

	public AtmUser(Atm atm, String name){
		super(); // 부모의 기능을 가져다 쓰기 위해 부모의 생성자를
				 // 자식의 생성자 내부에 호출함.
		this.atm = atm;
		this.name = name;
	}
	@Override
	public void run() {
		atm.inchul(name);
	}
}

/*
 public  void inchul(String name)
 synchronized 키워드를 사용하지 않았을 때 결과
홍길동님이 인출요청함
문길동님이 인출요청함
김길동님이 인출요청함
홍길동 님 인출중..
문길동 님 인출중..
김길동 님 인출중..
홍길동 인출해 나감
김길동 인출해 나감
문길동 인출해 나감
*/