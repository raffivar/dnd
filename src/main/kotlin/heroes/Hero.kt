package heroes

open class Hero(
    protected val name: String,
    private val level: Int = 1
) {
    open fun attack() {
        println("$name is attacking")
    }
}