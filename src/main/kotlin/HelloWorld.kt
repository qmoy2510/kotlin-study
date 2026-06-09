package org.example
//fun으로 함수 선언
fun main() {
    //val(value) 상수 선언
    val popcornBox = 5;
    val hotdog = 7;

    //var(variable) 변수 선언
    var customer = 10;

    customer = 8;
    //print, println 표준 출력
    println("Hello World");

    //문자열 템플릿
    //아래 처럼 $변수명은 변수 값이 문자열로 나옴
    println("고객의 수는 $customer 명입니다.");
    //코드 쪼가리도 넣을 수 있음
    println("고객의 수는 ${customer+3} 명입니다.");

}