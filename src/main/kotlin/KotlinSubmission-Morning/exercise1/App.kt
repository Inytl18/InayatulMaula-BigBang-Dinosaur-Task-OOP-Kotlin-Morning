package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    val firstName = "Inayatul"
    val lastName = "Maula"
    val age = 22
    val dating = false

    println( "Nama : $firstName $lastName")
    println("Umur : $age tahun")
    if (dating) {
        println( "Status = Taken" )
    } else {
        println( "Status = Single" )
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("Nama Tim : $groupId")
    println("Member : ")

    var i = 0
    for (member in groupMember) {
        i++
        println("$i. $member")
    }

    println("Sesi : $session")

    return """
        Informasi Tim
        Grup : $groupId
        Member : ${groupMember.size}
        Sesi : $session
    """.trimIndent()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val member = listOf(
        "Billy Dwi Prokoso",
        "Adella Maulana Annur Ramadhan",
        "Alvito Kurnia Fahrio",
        "Fadhlan Akbarullah",
        "Muhammad Zaki Raihan",
        "Rafi Kahfi Yugi",
        "Dimas Anggoro Harahap",
        "Ahmad Yusuf",
        "Yassar Muwwafaq",
        "Anggi Putri Meriani",
        "Inayatul Maula"
    )

    val bigBangTeam = member.get(10)
    return listOf(bigBangTeam)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Joy", "Kak Maulana")
    val countOfGroup = arrayOf<String>(
        "Billy Dwi Prokoso",
        "Adella Maulana Annur Ramadhan",
        "Alvito Kurnia Fahrio",
        "Fadhlan Akbarullah",
        "Muhammad Zaki Raihan",
        "Rafi Kahfi Yugi",
        "Dimas Anggoro Harahap",
        "Ahmad Yusuf",
        "Yassar Muwwafaq",
        "Anggi Putri Meriani",
        "Inayatul Maula"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("BigBang & Dinosaur",
        listOf("Billy Dwi Prokoso",
        "Adella Maulana Annur Ramadhan",
        "Alvito Kurnia Fahrio",
        "Fadhlan Akbarullah",
        "Muhammad Zaki Raihan",
        "Rafi Kahfi Yugi",
        "Dimas Anggoro Harahap",
        "Ahmad Yusuf",
        "Yassar Muwwafaq",
        "Anggi Putri Meriani",
        "Inayatul Maula"),


        "Morning")

}