package heroes

class Cleric(name: String, level: Int = 1) : Hero(name, level) {
    override fun attack() {
        println("$name heals the team and attacks with holy power!")
    }}