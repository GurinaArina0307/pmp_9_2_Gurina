package railways.passenger
// Пакет для работы с пассажирами и заявками

import Railway_ticket.Trains
import railways.ticket.Ticket

// Класс для представления пассажира и его заявки
class Passenger(
    val name: String
) {
    // Метод для создания заявки на билет
    fun requestTicket(train: Trains, date: String): Ticket {
        // Создание обычного билета (можно изменить на RefundableTicket)
        return Ticket(name, date, train)
    }
}