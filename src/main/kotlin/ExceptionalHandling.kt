import com.sun.security.jgss.ExtendedGSSCredential
import java.lang.Exception
import java.lang.IllegalArgumentException

fun main(){

    var arr = arrayOf(1,2,3)

    try {
        println(arr[5])
    }
    catch (ex : NullPointerException){

    }

    catch (e: Exception){
        println("Please check your array index")
    }

    finally {
        println("I will excute no matter what")
    }

    createUserList(5)
    createUserList(-2)


}

fun createUserList(count: Int){

    if(count < 0) {
        throw IllegalArgumentException("count must be grater than 0")
    }
    else{
        println("User list is created uysing $count users")
    }
}


