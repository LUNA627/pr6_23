fun main() {
    try {
        println("Первая путевка: БАРСЕЛОНА (5 звезд. Всё включено)")
        println("Введите стоимость первой путевки")
        var priseOneTravelPackage = readLine()!!.toDouble()

        if (priseOneTravelPackage <= 0) {
            println("Стоимость должна быть больше 0")
            return
        }

        println("Введите количество дней первой путевки)")
        var numberOfDaysOneTravelPackage = readLine()!!.toInt()

        if (numberOfDaysOneTravelPackage <= 0) {
            println("Количество дней должно быть больше 0")
            return
        }

        println("Вторая путевка: МОНАКО (4 звезды. Всё включено)")
        println("Введите стоимость второй путевки")
        var priseSecondTravelPackage = readLine()!!.toDouble()

        if (priseSecondTravelPackage <= 0) {
            println("Стоимость должна быть больше 0")
            return
        }

        println("Введите количество дней второй путевки)")
        var numberOfDaysSecondTravelPackage = readLine()!!.toInt()

        if (numberOfDaysSecondTravelPackage <= 0) {
            println("Количество дней должно быть больше 0")
            return
        }

        println("Вторая путевка: ПАРИЖ (3 звезды. Не всё включено)")
        println("Введите стоимость третьей путевки")
        var priseThirdTravelPackage = readLine()!!.toDouble()

        if (priseThirdTravelPackage <= 0) {
            println("Стоимость должна быть больше 0")
            return
        }


        println("Введите количество дней третьей путевки")
        var numberOfDaysThirdTravelPackage = readLine()!!.toInt()

        if (numberOfDaysThirdTravelPackage <= 0) {
            println("Количество дней должно быть больше 0")
            return
        }

        println("Введите количество денег на путевку")
        var moneyAvailable = readLine()!!.toDouble()

        if (priseThirdTravelPackage <= 0) {
            println("Кличество денег должно быть больше 0")
            return
        }

        println("Введите количество дней на путевку")
        var freeDays = readLine()!!.toInt()

        if (numberOfDaysThirdTravelPackage <= 0) {
            println("Количество дней должно быть больше 0")
            return
        }

        var sumPrise = priseOneTravelPackage + priseSecondTravelPackage + priseThirdTravelPackage
        var sumDay = numberOfDaysOneTravelPackage + numberOfDaysSecondTravelPackage + priseThirdTravelPackage
        when {
            (moneyAvailable >= sumPrise && freeDays >= sumDay) -> println("Человек может поехать во ВСЕ города")
            (moneyAvailable >= priseOneTravelPackage && freeDays >= numberOfDaysOneTravelPackage && moneyAvailable < sumPrise && freeDays < sumDay) -> println("Человек может поехать в БАРСЕЛОНУ")
            (moneyAvailable >= priseSecondTravelPackage && freeDays >= numberOfDaysSecondTravelPackage && moneyAvailable < priseOneTravelPackage && freeDays < numberOfDaysOneTravelPackage) -> println("Человек может поехать в МОНАКО")
            (moneyAvailable >= priseThirdTravelPackage && freeDays >= numberOfDaysThirdTravelPackage && moneyAvailable < priseSecondTravelPackage && freeDays < numberOfDaysSecondTravelPackage) -> println("Человек может поехать в ПАРИЖ")
            else -> println("Человек не куда не поедет")
        }

    }



    catch (e:Exception) {
        println("Неверный формат данных")
    }
}