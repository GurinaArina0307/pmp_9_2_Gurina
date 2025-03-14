package railways.ticket
// Пакет для модели билетов

// Базовый класс для билетов
open class Ticket(
    val passengerName: String,
    val date: String,
    val train: Railway_ticket.Trains
) {
    open fun getTicketInfo(): String {
        return "Билет на имя $passengerName, Дата поездки: $date, Информация о поезде: ${train.getTrainInfo()}"
    }
}

// Класс-наследник для билетов с возвратом
class RefundableTicket(
    passengerName: String,
    date: String,
    train: Railway_ticket.Trains
) : Ticket(passengerName, date, train) {
    override fun getTicketInfo(): String {
        return "Билет с возвратом: " + super.getTicketInfo()
    }
}