fun main(args: Array<String>) {



    while (true){
        println("**** Calculadora ******\n")
        println("Digite 0 - Sair")
        println("Digite 1 - Soma")
        println("Digite 2 - Multiplicação")
        println("Digite 3 - Subtração")
        println("Digite 4 - Porcentagem")
        println("Digite 5 - Raiz Quadrada")
        println("Digite 6 - Logaritmo")
        print("Digite aqui: ")

        when(readln().toInt()){
            0 -> break

            1 -> {
                println("**** Função Soma ****")
                println("Digite o primeiro numero")
                val num1 = readln().toInt()
                println("Digite o segundo numero")
                val num2 = readln().toInt()
                Calculadora.soma(num1, num2)

            }

            2 -> {
                println("**** Função multiplicação ****")
                println("Digite o primeiro numero")
                val num1 = readln().toInt()
                println("Digite o segundo numero")
                val num2 = readln().toInt()
                Calculadora.multiplicacao(num1, num2)
            }

            3 -> {
                println("**** Função Subtração ****")
                println("Digite o primeiro numero")
                val num1 = readln().toInt()
                println("Digite o segundo numero")
                val num2 = readln().toInt()
                Calculadora.subtracao(num1, num2)
            }

            4 -> {
                println("**** Função Porcentagem ****")
                println("Digite a porcentagem")
                val por = readln().toInt()
                println("Digite o valor")
                val numb = readln().toInt()
                Calculadora.porcentagem(por, numb)
            }

            5 -> {
                println("**** Função Raiz quadrada ****")
                println("Digite o numero")
                val num1 = readln().toDouble()
                Calculadora.raizquadrado(num1)
            }

            6 -> {
                println("Digite a base")
                val n2 = readln().toDouble()
                println("Digite o logaritmo")
                val n1 = readln().toDouble()
                Calculadora.logaritmo(n1, n2)
            }

            else ->{

                println("Valor digitado inválido!")
            }



        }

    }


}
