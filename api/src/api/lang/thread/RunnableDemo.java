package api.lang.thread;

/*
 run() �� ȣ���ϴ� ���� Ŭ���� ������ �޼ҵ� ȣ��
 start()�� ȣ���ϴ� ���� �����尡 �۾��� �����ϴµ�
 �ʿ��� ȣ�⽺��(call stack)�� ������ ����, run() ��
 ȣ���ؼ�, ������ ȣ�⽺�ÿ� run()�� �����Ų��.
 ��, �����带 ������ Ŭ������ start()�� ���� �����ؾ� �Ѵ�.
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImple();
		/* ������ Thread(Runnable r)*/
		Thread thr = new Thread(r);  // <- r�� ����.  .. SCJP���趧 �����
		thr.start();
	}
}

class RunnableImple implements Runnable{  // ���߻���� �ȵǱ� ������ �������̽� Runnable�� ����Ѵ�.

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			/*
			 * ����� �ƴϱ⶧���� super�� ����� �� ����.
			 * ���� �޼ҵ�ü���� ���� getName�� ȣ���Ͽ���.
			 * ���� Thread.currentThread()�� ���ϰ���
			 * String �� �ƴ϶� Thread �ν��Ͻ� ��ü ���� Ȯ���ϴ�.
			 */
			System.out.println(Thread.currentThread().getName());
		}
	}
}
