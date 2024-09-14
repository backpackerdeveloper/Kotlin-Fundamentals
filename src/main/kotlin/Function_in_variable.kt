import kotlin.math.pow

fun main(){

    println(summ(2.0, 3.0))
    println(powerr(2.0, 3.0))

    var fn: (a: Double, b: Double) -> Double = ::summ
    println(fn(2.0,3.0))

}

fun summ(a : Double, b: Double) : Double{
    return a + b
}

fun powerr(a : Double, b: Double) : Double{
    return a.pow(b)
}