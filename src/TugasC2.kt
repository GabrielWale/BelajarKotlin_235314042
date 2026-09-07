fun main() {
    print("Masukkan nilai A: ")
    var a = readln().toInt()

    print("Masukkan nilai B: ")
    var b = readln().toInt()

    println("\nSebelum ditukar:")
    println("A = $a")
    println("B = $b")

    val temp = a
    a = b
    b = temp

    println("\nSetelah ditukar:")
    println("A = $a")
    println("B = $b")
}