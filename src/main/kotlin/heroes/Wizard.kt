package heroes

class Wizard(name: String, level: Int = 1) : Hero(name, level) {
    override fun attack() {
        println("$name casts a powerful spell!")
    }
}