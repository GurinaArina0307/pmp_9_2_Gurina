package Railway_ticket

// базовый класс поездов
open class Trains(
    val trainNumber: String,
    val startStation: String,
    val endStation: String,
    val ticketPrice: Double
) {
    // функция
    open fun getTrainInfo(): String {
        return "Поезд №$trainNumber, Начальная станция: $startStation, Конечная станция: $endStation, " +
                "Цена билета: $ticketPrice"
    }
}

// класс-наследник для скоростных поездов
class HighSpeedTrain(
    trainNumber: String,
    startStation: String,
    endStation: String,
    ticketPrice: Double
) : Trains(trainNumber, startStation, endStation, ticketPrice) {
    override fun getTrainInfo(): String {
        return "Скоростной " + super.getTrainInfo()
    }
}

