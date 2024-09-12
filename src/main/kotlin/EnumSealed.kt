fun main(){

    val day = Day.SUNDAY
    day.printFormattedDay()

}

enum class Day(val number: Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THRUSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay(){
        println("DAy is $this")
    }
}