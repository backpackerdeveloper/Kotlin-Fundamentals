fun main(){

    val tile : Tile = Red("Mushroom Red", 25)
    val points = when(tile){
        is Red -> tile.points * 2
        is Blue -> tile.points * 5
    }
    print(points)
}

sealed class Tile //  as we dont define body here so, its a Abstract class also
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int):Tile()