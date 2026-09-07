fun main() {
    print("Masukkan nama pegawai : ")
    val namaPegawai = readln()

    print("Masukkan gaji pokok   : ")
    val gajiPokok = readln().toDouble()

    print("Masukkan tunjangan    : ")
    val tunjangan = readln().toDouble()

    print("Masukkan uang lembur  : ")
    val uangLembur = readln().toDouble()

    print("Masukkan potongan     : ")
    val potongan = readln().toDouble()

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println("\nRincian Gaji Pegawai")
    println("Nama Pegawai : $namaPegawai")
    println("Gaji Kotor   : Rp $gajiKotor")
    println("Gaji Bersih  : Rp $gajiBersih")
}