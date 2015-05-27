package api.lang.object;

public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Amblulance amblulance = new Amblulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
	}
	public void doWork(Car c){
		/*
		 * 소방차가 Car 타입인지 확인 후
		 * 맞다면 (FireCar) 로 객체 캐스팅을 해라
		 */
		if(c instanceof FireCar){
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
			
			/*
			 * 구급차가 Car 타입인지 확인 후
			 * 맞다면 (FireCar) 로 객체 캐스팅을 해라
			 */
		}else if(c instanceof Amblulance){
			Amblulance a = (Amblulance) c;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}
class Car{
	String color;
	int door;
	void driver(){System.out.println("운전중.."); }
	void stop(){ System.out.println("스톱 !!");}
}

class FireCar extends Car{  // Car 클래스를 상속받은 소방차
	void shootWater(){
		System.out.println("물뿌려 불끄는 중");
	}
}
class Amblulance extends Car{  // Car 클래스를 상속받은 구급차
	void siren(){
		System.out.println("사이렌을 울리고 가는 중..");
	}
}
