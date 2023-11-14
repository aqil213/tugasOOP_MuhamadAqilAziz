package id.infinitelearning.KotlinSubmission.exercise4

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation
import javax.xml.bind.ValidationException



    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
 fun validateAndSayHello(name: String){
     if (name.isBlank()){
         throw ValidationException("Name is blank")
     }else{
         println("Hello $name")
     }
 }
fun main() {
    try {
        validateAndSayHello("AQIL")
        validateAndSayHello("")
    }catch (error: ValidationException) {
        println(" Terjadi Error ${error.message}")
 }
}