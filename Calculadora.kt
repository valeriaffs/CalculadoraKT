/**
 * Desafio
 * criar uma calculadora que dado dois valores Float? e um numero correspondente a operação(constante),
 * retorne e imprima o resultado como Float ou uma mensagem de erro caso um dos valores seja nulo
 */

fun main() {
    var a:Float? = 2.0f
    var b:Float? = 4.0f
    var c:Float? = null
    var d:Float? = 0.0f
  
  println(soma(a,b))
  println(subtracao(a,b))
  println(multiplicacao(a,c))
  println(divisao(a,b))
  println(fatorial(b))
  println(divisao(a,d))
  

    
}

fun soma(num1: Float? , num2: Float?): Float?{
     val num3:Float = num1?: 0.0f
     val num4:Float = num2?: 0.0f
    
     val resultado = num3.plus(num4)
    if(num1 == null || num2 == null)println("valores não pode ser null")
    
    return resultado  
}

fun subtracao(num1: Float?,num2:Float?): Float?{
    val num3:Float = num1?: 0.0f
    val num4:Float = num2?: 0.0f
    
    val resultado:Float?= num3.minus(num4)
    if(num1 == null || num2 == null)println("valores não pode ser null")
    return resultado
}

fun multiplicacao(num1: Float?, num2:Float?): Float{
    val num3:Float = num1?: 1.0f
    val num4:Float = num2?: 1.0f
    val resultado:Float = num3.times(num4)
    if(num1 == null || num2 == null)println("valores não pode ser null") 
    return resultado
}

fun divisao(num1: Float?, num2:Float?): Float{
    val num3:Float = num1?: 1.0f
    val num4:Float = num2?: 1.0f
    val resultado:Float = num3.div(num4)
    if(num2 == 0.0f)println("Não é possivel dividir por zero")
    if(num1 == null || num2 == null)println("valores não pode ser null")  
    return resultado
}

fun fatorial(num1:Float?): Float?{
    var num2: Float = num1?: 1.0f
    var resultado:Float = num2
       
    while(resultado > 0.0f){
       resultado = resultado.times(resultado -1.0f)
       resultado--
    }
    return resultado
}






