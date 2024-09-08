fun main(){

    var arr = arrayOf("one", "two", "three")
    var arr1 = arrayOf(1,2,3)

    var arr2 = arrayOf<Int>(3,4,5) // explicitly defining array type here

    println(arr[0])
    println(arr.get(1))
    arr.set(0, "hello")
    print(arr[0])
}