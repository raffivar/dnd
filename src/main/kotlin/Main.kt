import heroes.Cleric
import heroes.Warrior
import heroes.Wizard

fun main() {
    val heroes = listOf(
        Warrior("Guy"),
        Wizard("Helena"),
        Cleric("Alice")
    )

    for (hero in heroes) {
        hero.attack()
    }
}