fun isPrime(number: Int) : Boolean {
    return 2.rangeTo(number.minus(1)).any { number.rem(it) == 0 }
}

fun main(args: Array<String>) {
  (1..1000).forEach {
    if(isPrime(it)){
      println(it)
    }
  }
}
