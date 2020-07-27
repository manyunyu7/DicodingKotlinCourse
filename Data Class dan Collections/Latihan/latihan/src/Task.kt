/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "Type" to "Motorcycle",
            "Maximal Speed" to "230Km/s",
            "Maximal Tank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle["Type"]
    val maxSpeed = vehicle["Maximal Speed"]
    val maxTank = vehicle["Maximal Tank"]


    // TODO 3
    println("Vehicle")
    println("Type: $type")
    println("Maximal Speed: $maxSpeed")
    println("Maximal Tank: $maxTank")

}