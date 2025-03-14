package onlinestore

// Класс для товароведа
class Merchandiser(val id: Int, val name: String) {
    // Функция для регистрации продажи
    fun registerSale(order: Order): String {
        return "Продажа зарегистрирована тавароведом № ${order.id} - $name. \nОбщая сумма: ${order.calculateTotalPrice()}"
    }

    // Функция для добавления клиента в черный список
    fun addToBlacklist(client: Client, blacklist: Blacklist) {
        blacklist.add(client)
        println("Клиент ${client.name} - добавлен в черный список.")
    }
}