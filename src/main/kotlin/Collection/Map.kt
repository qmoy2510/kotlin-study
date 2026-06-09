package org.example.Collection

fun main() {
    //불변 Map 생성
    //key to value 모양으로 작성하면 됨
    val readOnlyMap = mapOf("감자" to 50, "밥" to 70, "두부" to 100);
    println(readOnlyMap);

    //명시적 타입 선언이 포함된 가변 맵
    val myMap = mutableMapOf<String, Int>("감자" to 50, "밥" to 70, "두부" to 100);
    println(myMap);

    //값에 접근 하려면 []대괄호 이용
    println("감자는 ${myMap["감자"]}원 입니다.")

    //존재하지 않는 key값으로 접근시 null값 반환
    //println("김재휘는 ${myMap["김재휘"]}");

    //Key값과 Value값을 추가할 때는 없는 key값에 value를 넣어주면 됨
    myMap["김재휘"] = 3;

    //지울때는 .remove()메서드를 이용하면 됨
    myMap.remove("김재휘");

    //존재하는 키인지 확인하려면 .containsKey() 메서드를 사용하면 됨
    println(myMap.contains("감자"));

    //Key값 컬랙션 또는 value 컬랙션을 얻으려면 .Keys, .Values 속성을 이용하면 됨
    println(myMap.keys);
    println(myMap.values);
}
