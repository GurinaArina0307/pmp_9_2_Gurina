fun main(){
    // Создание поездов
    val train1 = Railway_ticket.HighSpeedTrain("A123", "Москва", "Санкт-Петербург", 1500.0)

    // Создание пассажира
    val passenger1 = railways.passenger.Passenger("Иван Иванов")

    // Пассажир делает заявку на билет
    val ticket1 = passenger1.requestTicket(train1, "2023-10-15")

    // Печать информации о билете
    println(ticket1.getTicketInfo())

}