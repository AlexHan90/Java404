package day12;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;      
		int age;
		System.out.println("이름 입력: ");
		name = input.next();
		
		System.out.println("나이 입력: ");
		age = input.nextInt();
		
		Ex05 ex = new Ex05();
		ex.setName(name);     // 입력한값 전달하고
		ex.setAge(age);			// 입력한 나이전달
		 System.out.println();
		 ex.getName(); //get name 이라는게 호출된다
		 System.out.println(ex.getAge());  //만으로 출력
		 System.out.println("이름 : " + ex.getName());
		 System.out.println("나이 : " + ex.getAge());
	}
	
}
