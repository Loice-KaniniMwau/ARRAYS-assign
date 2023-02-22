

fun main() {
    mynames()
    mycities()
    mynumbers()
    println(identity())

}
//question1
fun mynames (){
    var final= arrayOf<String>()
    var mylast=final.plus(arrayOf("maryanne","njoki","jacinta","joanne"))
    println(mylast.contentToString())

     }


    //question 2
    fun mycities() {
        var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
        for (x in cities) {
            println(x.capitalize())
        }
    }



//question3

     fun mynumbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var final= arrayOf(numbers[1] ,numbers[4])
    println(final.sum())
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
//question4
fun identity():String{
    var nickName=arrayOf<String>()
    var fiNal=nickName.plus(arrayOf("kanini","loice","mwau"))
    return fiNal.contentToString()


}