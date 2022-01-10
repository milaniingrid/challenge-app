open class Item(val name: String, val price: Int)

class Hotel : Item("Hotel", 75) {
    override fun toString(): String {
        return name
    }
}

class SPA : Item("SPA", 30) {
    override fun toString(): String {
        return name
    }
}

class Wiskey : Item("Wiskey", 10) {
    override fun toString(): String {
        return name
    }
}

class Beer : Item("Beer", 5) {
    override fun toString(): String {
        return name
    }
}

class Juice : Item("Juice", 9) {
    override fun toString(): String {
        return name
    }
}

class Barco : Item("Barco", 75) {
    override fun toString(): String {
        return name
    }
}