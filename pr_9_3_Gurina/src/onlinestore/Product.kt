package onlinestore

// Базовый класс для товара
open class Product(val id: Int, val name: String, val price: Double)

// Класс для электронного товара (наследник Product)
class ElectronicProduct(id: Int, name: String, price: Double, val warrantyPeriod: Int) : Product(id, name, price)

// Класс для бытового товара (наследник Product)
class HouseholdProduct(id: Int, name: String, price: Double, val material: String) : Product(id, name, price)

// Псевдонимы для создания объектов товаров
typealias ProductAlias = Product
typealias ElectronicProductAlias = ElectronicProduct
typealias HouseholdProductAlias = HouseholdProduct