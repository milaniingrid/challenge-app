data class Friend(
    var friendName: String
) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Friend {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Friend {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Friend #${friendName}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

