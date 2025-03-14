package onlinestore

fun main() {
    // Создаем товары
    val laptop = ElectronicProductAlias(1, "Ноутбук", 1200.0, 24)
    val blender = HouseholdProductAlias(2, "Блендер", 50.0, "Пластик")

    // Создаем клиента
    val client = Client(1, "Анна Ананьева", "anna.a@gmail.com")

    // Создаем заказ
    val order = Order(1, client, listOf(laptop, blender))

    // Создаем товароведа
    val merchandiser = Merchandiser(14, "Алиса Куприна")

    // Регистрируем продажу
    val saleDetails = merchandiser.registerSale(order)
    println(saleDetails)

    // Создаем черный список
    val blacklist = Blacklist()

    // Добавляем клиента в черный список (если он не оплатил заказ)
    merchandiser.addToBlacklist(client, blacklist)

    // Проверяем, находится ли клиент в черном списке
    if (blacklist.isInBlacklist(client)) {
        println("${client.name} находится в черном списке.")
    }

    // Выводим черный список
    blacklist.printBlacklist()
}