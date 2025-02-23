 fun main() {
     try {
         println("Введите первое число: ")
         val firstNumber = readLine()!!.toInt();
         when {
             (firstNumber in 10..99 || firstNumber in -99..-10) -> println("Первое число двузначное")
             else -> println("Первое число не двузначное")
         }

         println("Введите второе число: ")
         val secondNumber = readLine()!!.toInt();
         when {
             (secondNumber in -9..9) -> println("второе число однозначное")
             else -> println("Второе число не однозначное")
         }


     }
     catch (e:Exception) {
      println("Неверный формат данных")
     }
 }