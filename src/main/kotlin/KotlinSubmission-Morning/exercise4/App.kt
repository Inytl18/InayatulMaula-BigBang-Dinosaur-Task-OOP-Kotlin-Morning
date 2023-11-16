package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.Exception

fun main() {

    println("Contoh Try Sukses : ")
    checkSuccess()
    println("COntoh Try Gagal : ")
    checkFailed()
}

fun checkFailed() {
    var number = listOf(1, 2, 3)
    try {
        println(number[4])
    }

    catch (e:Exception) {
        println("Data yang Anda masukkan Tidak Valid")
    }
}

fun checkSuccess() {
    var number = listOf(1, 2, 3)
    try {
        println(number[1])
    }
    catch (e:Exception) {
        println("Data yang Anda masukkan Valid")
    }
}
/**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
