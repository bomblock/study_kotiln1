package kr.bomblock.study_kotiln1

fun main(){
    //todo: atgment = 인수 addup 옆은 모두 인수 이므로 인수를 이용하는 값이다.
    var avg = avg(5.3,13.555)
    print("result is $avg")
}

fun avg(a: Double, b:Double) : Double{
    return  (a+b)/2
}

//todo: method a method(메서드 = 방법) is a Function(함수) within a class(클레스)
//parameter (input)
fun addUp(a: Int, b:Int) :Int{
    //output
    return a+b
}

fun myFunction(){
    print("called from myFunction")

}