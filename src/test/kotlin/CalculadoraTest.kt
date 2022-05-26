import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    @Test
    fun somaTest(){

        assertEquals(3, Calculadora.soma(1,2))
    }

    @Test
    fun multiplicacaoTest(){

        assertEquals(2, Calculadora.multiplicacao(1,2))
    }
    @Test
    fun subtracaoTest(){

        assertEquals(0, Calculadora.subtracao(2,2))
    }
    @Test
    fun divisaoTest(){

        assertEquals(2, Calculadora.divisao(4,2))
    }

    @Test
    fun porcentagemTest(){

        assertEquals(210, Calculadora.porcentagem(30, 700))
    }

    @Test
    fun logaritmoTest(){

        assertEquals(0.5, Calculadora.logaritmo(6.0,36.0))
    }

    @Test
    fun raizquadrada(){

        assertEquals(2.0, Calculadora.raizquadrado(4.0))
    }

}


