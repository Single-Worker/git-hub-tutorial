enum class Animals { // Создадим перечисление
    DOG, CAT, BEAR, FOX;

    // name - переменная имеющая значение объекта выбранного из перечисления
    fun toLowerCase() = name.toLowerCase().capitalize() // Создадим функцию, приводящую name в нижний регистр
}