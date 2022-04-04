package day12;

public class Ex02 {
	
	int a= 10;
	public void setA(int a) {
		System.out.println(this);
		this.a= a;  // 인스턴수 변수를 가리킨다, 이름이같을떄
	}
	public void print() {
		System.out.println("a : " +a);
	}

	}


