fun calculate(num1: Double, num2: Double, operation: (Double, Double) -> Double):Double = operation(num1, num2)

fun sum (num1: Double, num2: Double) = num1.plus(num2)
fun minus (num1: Double, num2: Double) = num1.minus(num2)
fun multiply (num1: Double, num2: Double) = num1.times(num2)

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

            }

        }

        if(choice !in 1..7){ println("Digite um número válido.") }

    }while(choice in 1..6 && choice != 7)

    println("Até a próxima!")
}