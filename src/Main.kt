fun main(args: Array<String>) {
val user = MainProvider()
    user.printInfo(User())
    println(user.getConnection())
    println("\n")
    checkDataTypes(user)
}

fun checkDataTypes(obj: MainProvider) { // Через функцию проверяем принадлежит ли объект к данному интерфейсу

    if (obj is DbConnection) {
        println(obj.getConnection())
    }
    if (obj is UserInfoProvider) {
        obj.printInfo(User())
    }
}
