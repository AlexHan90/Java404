package day12;
/*
 this 
 - 자기 자신의 정보를 저장하는 매개변수
 - 따로 생성하지 않더라도 메소드의 0번째 매개변수로 생성됨
 - 자기 자신을 참조, 
 this 클래스의 시작점이라고 생각하자
 */


public class MainClass02 {
	public static void main(String[] args) {
		
		Ex02 ex = new Ex02();
		System.out.println(ex);		
		ex.setA(12345);          // 10이 실행된다. but this를 사용하면 12345 값이 들어간다.
		
		    //객체 위치정보가 나온다
		
		// ex.a = 789;
		
		ex.print();
		
		
		
	}

}
