package sec04.exam01;

public class Car {
	int gas;
	int minGas; // 한바퀴돌때 필요한 gas
	String teamName;
	String color;
	static int numberOfCars;
	
	Car (int gas, int minGas,String teamName, String color){
		this.gas=gas;
		this.minGas=minGas;
		this.teamName=teamName;
		this.color=color;
		numberOfCars++;
	}
	
	boolean IsLeftGas() {
		if (gas < minGas) {
			System.out.println("연료를 보충해야 합니다.");
			return false;
		}
		
		System.out.println("한바퀴 더 돌수 있어요.");
		return true;
	}
	
	void AddGas (int gas) {
		System.out.println("연료 만땅.");
		this.gas = gas;
	}
	
	void RunOneRound() {
		System.out.println("한바퀴 완주.");
		this.gas -= minGas;
	}
	
	static void ShownumberOfCars() {
		System.out.println("numberOfCars : "+ numberOfCars );
	}
	
	
	

}
