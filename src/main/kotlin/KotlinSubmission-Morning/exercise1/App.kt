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
    val firstName: String = "Aqil"
    val lastName: String = "Aziz"
    val age: Int = 23
    val single: Boolean = true
    println("Name: $firstName $lastName")
    println("Age: $age")
    println("Single: $single")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Kami dari group $groupId")
    println("kelas $session")
    println("Group Members: $groupMember")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val  fiftyOne = listOf("Aqil", "Widya", "Adel", "Afidz", "Aryanto")

    return listOf(fiftyOne)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Budi", "Annisah")
    val countOfGroup = arrayOf<String>("Aqil", "Widya", "Adel", "Afidz", "Aryanto")
    return mentor.size + countOfGroup.size
}
fun main() {


    myProfile()
    val myTeam = myTeam()
    println("My team are: $myTeam")
    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Fifty-One", listOf("Aqil ", "Widya", "Adel", "Afidz", "Aryanto"), "Morning")
}