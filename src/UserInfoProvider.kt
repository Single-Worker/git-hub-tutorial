interface UserInfoProvider { // Создадим интерфэйс
    val info: String // Создадим переменную внутри интерфейса, однако присвоить значение мжем только в классе

    fun printInfo(user: User) { // Создадим метод
        println(info) // Потом его можно переопределить
        user.printUser()
    }
}

interface DbConnection { // Создадим еще один интерфейс, лучше тоже делать отдельным файлом
    fun getConnection(): String
}

class MainProvider : UserInfoProvider, DbConnection { // Создадим файл, лучше это делать в отдельном файле
    override val info: String // становить значение переменной
        get() = "Method was called"
    override fun printInfo(user: User) { // Переопределим функцию интерфейса
        super.printInfo(user) // Оставить все функции метода
        println("дополнительный код") // добавить новые
    }

    override fun getConnection(): String {
        return "DB Connected"
    }
}