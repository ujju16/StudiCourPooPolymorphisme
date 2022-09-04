// Exemple d'héritage en Kotlin
  
  class O1 (val filleO2: FilleO2) {
    fun connecteO1() {
      filleO2.connecteMereO2() // envoie de message à la mère
      filleO2.connecteFilleO2() // envoie de message à la fille
    }
  }

  open class O2 (var x2: Int) {
    fun connecteMereO2() {
      println("Connecté à mereO2 et x=$x2")
    }
  }

  class FilleO2 (var x22: Int, var xF2: Int): O2(x22){
    fun connecteFilleO2() {
      println("Connecté à filleO2 et x=$xF2")
    }
  }
fun main() {
  
  val x2 = FilleO2(10, 100)
  val x1 = O1(x2)
  x1.connecteO1()
  
}