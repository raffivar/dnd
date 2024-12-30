package heroes

class Warrior(name: String, level: Int = 1) : Hero(name, level) {
    override fun attack() {
        println("$name charges with a sword!")
    }
}