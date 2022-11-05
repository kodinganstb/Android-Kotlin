// MEMBAHAS TENTANG "Tipe Data Number" Pada bahasa pemrograman Kotlin.
// TIPE DATA NUMBER, DIBAGI MENJADI 2 JENIS YAITU INTEGER DAN FLOAT.
// INTEGER ADALAH BILANGAN BULAT = 1 2 3 9 10
// FLOAT ADALAH BILANGAN DESIMAL = 2.1 2.3 1.4 5.1

fun main() {
    val tanggal: Int = 17
    val panjang: Float = 1.5F // Si 'F' belakang nilai 1.5 adalah penanda bahwa tipe data yang digunakan adalah 'Float', jika tidak menggunakan 'F' akan dianggap 'Double'.
    println(tanggal)
    println(panjang)

// Dalam Integer Number ada tipe datanya juga  :
// Byte(8), Short(16), Int(32), Long(64)
// Yang di dalam kurung () di atas adalah "size" atau ukuran tiap tipe data.
// Gimana nambah pusing? santai aja, aneh kalo belajar tidak mengalami kesulitan.


    // Byte
    val bitnomor1: Byte = 127 // RENTANG NILAI Byte yaitu 0 hingga 127 (bilangan positif) -0 hingga -128 (bilangan negatif).
//    val bitnomor2: Byte = 128

    println(bitnomor1)
//    println(bitnomor2) // JIKA "val bitnomor2" DIJALANKAN AKAN ERROR, KARENA NILAI Byte melebihi batas MAXIMAL, berlaku juga dalam bilangan negatif.


    // Short
    val shortnomor1: Short = 32767 // RENTANG NILAI Short yaitu 0 hingga 32767 (bilangan positif), -0 hingga -32768 (bilangan negatif).
//    val shortnomor2: Short = 32769

    println(shortnomor1)
//    println(shortnomor2) // JIKA "val shortnomor2" DIJALANKAN AKAN ERROR, KARENA NILAI Short melebihi batas MAXIMAL, berlaku juga dalam bilangan negatif.


    // Int
    val intnomor1: Int = 2_000_000_000 // RENTANG NILAI Int yaitu 0 hingga 2Milyar (bilangan positif), -0 hingga -2Milyar (bilangan negatif). (Terus kok ada si ' _ ' YA BUAT TANDA AJA BIAR MUDAH BACA NILAINYA HEHEHE)
//    val intnomor2: Int = 20000000000
    println(intnomor1)
//    println(intnomor2) // JIKA "val intnomor2" DIJALANKAN AKAN ERROR, KARENA NILAI Int melebihi batas MAXIMAL, berlaku juga dalam bilangan negatif.


    // Long
    val longnomor1: Long = 9_172_839_487_383_928_374 // RENTANG NILAI Long yaitu 0 hingga 9Kuintiliun (bilangan positif), -0 hingga -9Kuintiliun (bilangan negatif). (Terus kok ada si ' _ ' YA BUAT TANDA AJA BIAR MUDAH BACA NILAINYA HEHEHE)
//    val longnomor2: Long = 9_172_839_487_383_928_3740

    println(longnomor1)
//    println(longnomor2) JIKA "val longnomor2" DIJALANKAN AKAN ERROR, KARENA NILAI Long melebihi batas MAXIMAL, berlaku juga dalam bilangan negatif.



}