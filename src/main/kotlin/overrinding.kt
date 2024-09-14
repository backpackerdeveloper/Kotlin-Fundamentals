fun main(){

    val oneplus = OnePlus()

    oneplus.display()
    println(oneplus.size)
}

open class Mobile(){

    open val name: String = ""
    open val size: Int = 5

    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus: Mobile(){

    override val name : String = "One Plus"
    override val size: Int = 6

    override fun display() {
        super.display() //  here if we want to call our parent class method, so we can use super keyword to do that
        println("OnePlus Display") // then extra changes we want to override
    }
}