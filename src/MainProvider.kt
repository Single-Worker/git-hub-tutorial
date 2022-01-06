open class MainProvider : UserInfoProvider, DbConnection { // Создадим класс с двумя интерфейсами
    protected open val db = "DB Connected"

    override val info: String // Установить значение переменной
        get() = "Method was called"

    override fun printInfo(user: User) { // Переопределим функцию интерфейса
        super.printInfo(user) // Оставить все функции метода
        println("дополнительный код") // добавить новые
    }

    override fun getConnection(): String {
        return db
    }
}