fun main() {
    print("Masukkan nama mahasiswa : ")
    val namaMahasiswa = readln()

    print("Masukkan nilai Tugas    : ")
    val nilaiTugas = readln().toDouble()

    print("Masukkan nilai Kuis     : ")
    val nilaiKuis = readln().toDouble()

    print("Masukkan nilai UTS      : ")
    val nilaiUTS = readln().toDouble()

    print("Masukkan nilai UAS      : ")
    val nilaiUAS = readln().toDouble()

    val nilaiAkhir = (nilaiTugas * 0.25) + (nilaiKuis * 0.15) + (nilaiUTS * 0.25) + (nilaiUAS * 0.35)

    println("\n Hasil Nilai Akhir")
    println("Nama Mahasiswa : $namaMahasiswa")
    println("Nilai Akhir    : $nilaiAkhir")
}