package fibonacci

@main def run(): Unit = {
  println("Hello from Fibonacci!")
  println(s"fibonacci(10) = ${fibonacci(10)}")
}

def fibonacci(n: Int): Int = {
  if (n <= 1) n
  else fibonacci(n - 1) + fibonacci(n - 2)
}