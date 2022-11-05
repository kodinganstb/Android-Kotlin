import jdk.incubator.vector.VectorOperators.Binary

// MEMBAHAS TENTANG "Konversi Number" Pada bahasa pemrograman Kotlin.
// Konversi Number berguna ketika kita membuat sebuah program yang melakukan input dan mengirim informasi kepada database atau juga pengguna.
// Semisal pengguna menggunakan input Nomor untuk membuat kode hex warna, Database akan merespon dan mengirim kepada pengguna sebuah informasi yang dibutuhkan oleh peminta layanan (pengguna) dalam contoh ini adalah kode Hex Warna.


fun main() {
    val biner: Int = 0b110_000_111 // sengaja dikasih ' _ ' agar mudah untuk membacanya.
    println(biner) //  output bilangan bulat 391 dari Binary '0b110_000_111'

    val harga: Long = 9_000_000_000
    println(harga)

    val jumlah: Int = 211823746
    println(jumlah)

    // mari kita konversi tipe data Long ke Integer

    val hargaInt: Int = harga.toInt()
    println(hargaInt) // output bilangan bulat 410065408 dari konversi Long ke Int '9_000_000_000'

    // mari kita konversi Biner ke Double
    val doubleBiner: Double = biner.toDouble()
    println(doubleBiner) // output bilangan double 391.0 dari konversi Biner ke Double '0b110_000_111'

    // mari kita konversi Integer ke Short
    val jumlahInt: Short = jumlah.toShort()
    println(jumlahInt)

    // mari kita konversi Integer ke Hex
    val intNilai = 3459
    val konversiHex = Integer.toHexString(intNilai)
    println(konversiHex)

// Sungguh memusingkan sekali ya kalo dipikir-pikir wkwk,  ingat koding bukan untuk dihafal tapi dipahami, semakin sering latihan otomatis akan hafal dengan sendirinya.
// Sebenarnya masih banyak konversi-konversi lainnya karena takut kepanjangan nanti bikin males dibaca. Silahkan bereksperimen!
}