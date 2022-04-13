/*작성자 : 정지웅
작성일 : 2022-04-13
설 명 : 나이기록 프로그램
*/

package com.javaex.ex01;

public class Ex01 {
	public static void main(String[]args) {
// 순서 중요 공간잡고 값대입	
		

/*		
	int myAge; 변수선언		
	myAge = 25;  초기화
	int myAge = 25; // 변수선언 + 초기화
//	메모리에 값을  출력하는 메소드
	System.out.println(myAge);
	
	myAge = 26;
	
	System.out.println(myAge);
	*/
//	실행 끝나면 메모리공간은 없어짐
		
		byte no; 
//		no공간만들기
		no = -128;
		System.out.println(no);
//		long형은 int 범위까지는 L을 붙이지않아도된다.
//		long형은 int 범위를 벗어나는경우 L을 붙인다.
		long no2 ;
		no2 = 2147483648L;
		System.out.println(no2);
		//////////////////////////////////////
		//변수(소문자)선언, 초기화
		//////////////////////////////////////
		
		//변수 여러개일때 변수선언, 초기화
		//int var01, var02, var03;
		/*int var01;
		int var02;
		int var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		// 변수 여러개일때 변수+초기화
		// int var04-10, int var05-20, int var06-30;
		int var04 = 10;
		int var05 = 20;
		int var06 = 30;
		System.out.println(var04);
	*/
	}
}
