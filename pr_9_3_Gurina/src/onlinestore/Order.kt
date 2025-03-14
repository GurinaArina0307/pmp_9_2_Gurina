package onlinestore

// Класс для заказа
class Order(val id: Int, val client: Client, val products: List<ProductAlias>) {
    fun calculateTotalPrice(): Double {
        return products.sumOf { it.price }
    }
}