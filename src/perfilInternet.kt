fun main() {
    val amanda = Person("Amanda", 33, "jugar tennis", null)
    val atiqah = Person("Atiqah", 28, "trepar", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Nombre: $name")
        println("Edad: $age")
        if (hobby !=null){
            print("A ella le gusta $hobby.")
        }
        print("\n")
        if (referrer != null) {
            print("Tiene un referente llamado ${referrer.name}")
            print("\n")
            if (referrer.hobby !=null){
                print("a quien le gusta ${referrer.hobby}")
            }
            else{
                print(".")
            }

        }else{
            print("No tiene referente")
        }
        print("\n\n")
    }
}