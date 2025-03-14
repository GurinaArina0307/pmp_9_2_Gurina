class Chek(val passenger: Passager, val sum: Double){
    fun printChek(){
        println("Пассажир : ${passenger.name}")
        println("Сумма : $sum")
    }
}