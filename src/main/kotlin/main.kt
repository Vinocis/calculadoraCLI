import kotlin.math.sqrt

fun calculate(num1: Double, num2: Double, operation: (Double, Double) -> Double):Double = operation(num1, num2)

fun sum (num1: Double, num2: Double) = num1.plus(num2)
fun minus (num1: Double, num2: Double) = num1.minus(num2)
fun times (num1: Double, num2: Double) = num1.times(num2)
fun div (num1: Double, num2: Double) = num1.div(num2)
fun square (num: Double) = num.times(num)

fun main() {
    var choice: Int
    do{
        println("Digite um número de acordo com a operação desejada:")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Elevar ao quadrado")
        println("6 - Raiz quadrada")
        println("7 - Sair")
        choice = readLine()?.toIntOrNull() ?: 1

        when(choice){
            1 -> {
                print("Digite o primeiro número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: 1.0
                print("Digite o segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: 1.0
                println("O resultado é: ${"%.2f".format(calculate(num1, num2, ::sum))}")
            }
            2 -> {
                print("Digite o primeiro número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: 1.0
                print("Digite o segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: 1.0
                println("O resultado é: ${"%.2f".format(calculate(num1, num2, ::minus))}")
            }
            3 -> {
                print("Digite o primeiro número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: 1.0
                print("Digite o segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: 1.0
                println("O resultado é: ${"%.2f".format(calculate(num1, num2, ::times))}")
            }
            4 -> {
                do{
                    print("Digite o primeiro número: ")
                    val num1 = readLine()?.toDoubleOrNull() ?: 1.0
                    print("Digite o segundo número: ")
                    val num2 = readLine()?.toDoubleOrNull() ?: 1.0
                    if(num2 == 0.0) {
                        println("Não é possível dividir um número por zero.")
                    } else{
                        println("O resultado é: ${"%.2f".format(calculate(num1, num2, ::div))}")
                    }
                }while(num2 == 0.0)
            }
            5 -> {
                print("Digite o número: ")
                val num = readLine()?.toDoubleOrNull() ?: 1.0
                println("O resultado é ${"%.2f".format(square(num))}")
            }
            6 -> {
                do{
                    print("Digite o número: ")
                    val num = readLine()?.toDoubleOrNull() ?: 1.0
                    if(num < 0) {
                        println("Não é possível determinar a raiz de um número negativo.")
                    } else{
                        println("O resultado é ${"%.2f".format(sqrt(num))}")
                    }
                }while(num < 0)
            }
        }

        if(choice !in 1..7){ println("Digite um número válido.") }

    }while(choice in 1..6 && choice != 7)

    println("Até a próxima!")
}