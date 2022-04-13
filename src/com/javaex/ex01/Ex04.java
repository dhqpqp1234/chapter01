package com.javaex.ex01;

public class Ex04 {
	
	public static void main(String[]args) {
		//문자는 1글자	
	
	char ch01 = 'A';
	char ch02 = '안';
	
	
	System.out.println(ch01);
	System.out.println(ch02);
	
	//int로 안쓰게 조심 A는 문자형코드로 65
	char ch03 = 65;
	System.out.println(ch03);
	
	//숫자 3이아닌 글자 3을 입력하려면 ''를 입력해준다.글자 3은 계산이 안됨
	char ch04 = '3';
	System.out.println(ch04);
	
	//문자를 한글자이상 쓸대 사용한다, 문자쓸때 ""를 쓴다.
	//String은 글자수 상관없이 ""를 쓴다.
	String str = "안녕하세욥";
	System.out.println(str);
	//
	}
}
