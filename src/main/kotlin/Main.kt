fun main() {
    val ordersList = mutableListOf<Friend>()

    // Add an item to an order
    val milani = Friend("Ingrid Milani")
    milani.addItem(Hotel())
    ordersList.add(milani)

    // Add multiple items individually
    val emmaGoldman = Friend("Emma Goldman")
    emmaGoldman.addItem(Beer())
    emmaGoldman.addItem(Hotel())
    ordersList.add(emmaGoldman)

    // Add a list of items at one time
    val fridaKahlo = Friend("Frida Kahlo")
    val items = listOf(Juice(), Hotel(), )
    fridaKahlo.addAll(items)
    ordersList.add(fridaKahlo)

    // Use builder pattern
    val olgaBenario = Friend("Olga Benário")
        .addItem(SPA())
        .addItem(Juice())
    ordersList.add(olgaBenario)

    // Create and add order directly
    ordersList.add(
        Friend("Andrea Dworkin")
            .addItem(Beer())
            .addItem(SPA())
            .addItem(Wiskey())
    )

    // Print out each order
    for (order in ordersList) {
        order.print()
        println()
    }
}