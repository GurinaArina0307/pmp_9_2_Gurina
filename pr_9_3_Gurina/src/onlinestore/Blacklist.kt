package onlinestore

// Класс для черного списка
class Blacklist {
    private val clients = mutableListOf<Client>()

    fun add(client: Client) {
        clients.add(client)
    }

    fun isInBlacklist(client: Client): Boolean {
        return clients.contains(client)
    }

    fun printBlacklist() {
        println("Черный список клиентов:")
        clients.forEach { println(it.name) }
    }
}