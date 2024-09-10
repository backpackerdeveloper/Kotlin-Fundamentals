import java.util.Objects

fun main(){

    // below is use of SharingWidget Object
//    SharingWidget.incrementtwitterLikes()
//    SharingWidget.incrementtwitterLikes()
//    SharingWidget.incrementtwitterLikes()
//    SharingWidget.incrementFBLikes()
//    SharingWidget.display()

    // Anonomous object expression in interface
//    var obj = object: Clonable{
//        override fun clone() {
//            println("I am Clone")
//        }
//    }



    // below code for creating anonymous object
    var obj2 = object : People("shubham"){
        override fun fullName() {
            super.fullName()
            println("Anonymous - $name")
        }
    }

}

//object SharingWidget{
//    private var twitterlikes = 0
//    private var fblikes = 0
//
//    fun incrementtwitterLikes() = twitterlikes++
//    fun incrementFBLikes() = fblikes++
//
//    fun display() = println("FaceBook - $fblikes --- Twitter - $twitterlikes")
//
//}



// Anonomous object expression
interface Clonable{
    fun clone()
}

open class People(val name: String){
    open fun fullName() = println("Full Name - $name")
}