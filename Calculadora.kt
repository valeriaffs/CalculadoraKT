/**
 * Desafio
 * criar uma calculadora que dado dois valores Float? e um numero correspondente a operação(constante),
 * retorne e imprima o resultado como Float ou uma mensagem de erro caso um dos valores seja nulo
 */

const val ZERO = 0.0f
const val UM = 1.0f

fun main() {
    var a:Float? = 2.0f
    var b:Float? = 4.0f
    var c:Float? = null
    var d:Float? = 0.0f
  
   println(soma(a,b))
   println(subtracao(a,b))
   println(multiplicacao(a,c))
   println(divisao(a,b)) 
   println(divisao(a,d))
   println(fatorial(b))
   println(potenciacao(a,b))
  

    
}

fun soma(num1: Float? , num2: Float?): Float?{
     val num3:Float = num1?: ZERO
     val num4:Float = num2?: ZERO
    
     val resultado = num3.plus(num4)
    if(num1 == null || num2 == null)println("valores não pode ser null")
    
    return resultado  
}

fun subtracao(num1: Float?,num2:Float?): Float?{
    val num3:Float = num1?: ZERO
    val num4:Float = num2?: ZERO
    
    val resultado:Float?= num3.minus(num4)
    if(num1 == null || num2 == null)println("valores não pode ser null")
    return resultado
}

fun multiplicacao(num1: Float?, num2:Float?): Float{
    val num3:Float = num1?: UM
    val num4:Float = num2?: UM
    val resultado:Float = num3.times(num4)
    if(num1 == null || num2 == null)println("valores não pode ser null") 
    return resultado
}

fun divisao(num1: Float?, num2:Float?): Float{
    val num3:Float = num1?: UM
    val num4:Float = num2?: UM
    val resultado:Float = num3.div(num4)
    if(num2 == ZERO)println("Não é possivel dividir por zero")
    if(num1 == null || num2 == null)println("valores não pode ser null")  
    return resultado
}

fun fatorial(num1:Float?): Float?{
    var num2: Float = num1?: UM
    var resultado:Float = UM
    var contador: Float = num2
        
    if(num2 == ZERO) return UM
       
    while(contador > ZERO){
       resultado = resultado.times(contador)
       contador--       
    }
    return resultado
}

fun potenciacao(base:Float?, expoente:Float?): Float?{
    var baseF: Float = base?: UM
    var expoenteF: Float = expoente?: UM
    var resultado:Float = UM
    var contador:Float = expoenteF
    
    while(contador > ZERO){
       resultado = resultado.times(baseF)  
       contador--
    }
    return resultado
    
}


