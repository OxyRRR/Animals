fun main (args: Array<String>) {

    val animals = mutableListOf<Animals>()

    val wolf = EatingMeat("Волк - ", "плотоядное животное, которое ", "живет в лесу, ", "в стае.")
    val lion = EatingMeat("Лев - ", "плотоядное животное, которое ", "живет в cаванне, ", "в стае.")
    val hamster = EatingGrass("Хомяк - ", "травоядное животное, которое ", "живет в степи и ", "пищит.")
    val elephant = EatingGrass("Cлон - ", "травоядное животное, которое ", "живет в cаванне и ", ",в основном, молчит.")

    animals.add(wolf)
    animals.add(lion)
    animals.add(hamster)
    animals.add(elephant)

    println(animals)
}