class NewClass : MainProvider() { // Класс наследник, при наследовании перед классом предком нужно написать open
    override val db: String // Установить новое значение переменной класса родителя, в классе перед переменной должно быть open
        get() = "DB not connected"

    override val info: String // Установить новое значение для переменной класса MainProvider (переменная интерффейса UserInfoProvider)
        get() = "Новое значение переменной"

    override fun printInfo(user: User) { // Переопределить функцию в классе наследнике
        super.printInfo(user)
        println("Выводится текст из класса наследника")
    }
}