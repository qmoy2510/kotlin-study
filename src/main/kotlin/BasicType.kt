package org.example
fun main() {
    //var은 변수 선언시 타입을 추론해줌
    var custmoer = 10;

    //그래서 값이 없는 변수는 선언할 수 없음
    //var name

    custmoer = 8;
    custmoer += 3;
    custmoer -= 6;
    custmoer *= 5;
    custmoer /= 1;
    println(custmoer);

    //아래처럼 선언시에 타입도 같이 선언할 수 있음
    //타입설명은 귀찮으니 생략
    var year: Int;
    var name: String = "김재휘";

    println(name);
}