interface UserInfoProvider { // Создадим интерфэйс
    val info: String // Создадим переменную внутри интерфейса, однако присвоить значение можем только в классе

    fun printInfo(user: User) { // Создадим метод
        println(info) // Потом его можно переопределить
        user.printUser()
    }
}