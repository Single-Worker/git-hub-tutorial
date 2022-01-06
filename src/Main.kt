fun main(args: Array<String>) {
    val user = NewClass()
    user.printInfo(User())
    println(user.getConnection())
    println("\n")
    checkDataTypes(user)

    val userNew = object : MainProvider() { // Создадим объект, наследуемый от MainProvider, и сразу же переопределим функцию
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("Еще одно переопределение функции при создании объекта")
        }
    }
    checkDataTypes(userNew)

    val animal = Animals.BEAR // Создадим переменную в которой поместим значение Bear

    when(animal) { // Создадим оператор (аналог switch)
        Animals.CAT -> println(animal.toLowerCase())
        Animals.BEAR -> println(animal.toLowerCase())
        else -> println("Что-то другое")
    }
}

fun checkDataTypes(obj: MainProvider) { // Через функцию проверяем принадлежит ли объект к данному интерфейсу

    if (obj is DbConnection) {
        println(obj.getConnection())
    }
    if (obj is UserInfoProvider) {
        obj.printInfo(User())
    }
}
