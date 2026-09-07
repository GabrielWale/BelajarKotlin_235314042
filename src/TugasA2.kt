import java.util.Scanner

fun main(){
    val Scanner = Scanner(System.`in`)

    print("Masukkan suhu : ")
    val suhu = Scanner.nextDouble()

    val fahrenheit : Double = suhu * 9/5 + 32
    println("Fahrenheit : $fahrenheit ")
    val kelvin : Double = suhu + 273.15
    println("Kelvin : $kelvin")
}