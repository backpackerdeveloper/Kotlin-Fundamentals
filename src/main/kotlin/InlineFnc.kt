fun main(){

    calculateTimeandRun {
        loop(100000)
    }
}

fun calculateTimeandRun(fn: ()-> Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time traken ${end -start} ms")
}

fun loop(n: Long){
    for (i in 1..n){
        //
    }
}