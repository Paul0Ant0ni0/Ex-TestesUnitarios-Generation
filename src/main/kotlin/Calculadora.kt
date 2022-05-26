import kotlin.math.log
import kotlin.math.sqrt

class Calculadora {

    companion object {

        fun soma(n1: Int, n2: Int): Int {
            val sum = n1+n2
            println("Soma: $n1 + $n2 = $sum")
            return sum
        }

        fun subtracao(n1: Int, n2: Int): Int {
            val sub = n1 - n2
            println("Subtração: $n1 - $n2 = $sub")
            return sub
        }

        fun multiplicacao(n1: Int, n2: Int): Int {
            val mult = n1*n2
            println("Multiplicação: $n1 X $n2 = $mult")
            return mult
        }

        fun divisao(n1: Int, n2: Int): Int {
            val div = n1/n2
            println("Divisão: $n1 ÷ $n2 = $div")
            return div
        }

        fun raizquadrado(n1: Double): Double {
            val num = sqrt(n1)
            println("√$n1 = $num")
            return num
        }

        fun porcentagem(porcent: Int, valor: Int): Int {
            val calc = (valor/100)*porcent
            println("$porcent de $valor = $calc")
            return calc
        }

        fun logaritmo(n1: Double, n2: Double): Double {
            val calc = log(n1, n2)
            println("Base $n2 de logaritmo $n1, o logaritimando é $calc")
            return calc
        }
    }
}
