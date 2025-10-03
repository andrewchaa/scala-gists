package fibonacci

@main def run(): Unit = {
  println("Hello from Fibonacci!")
  println(s"fibonacci(10) = ${fibonacci(10)}")
  println(s"fibonacciTailRec(10) = ${fibonacciTailRec(10)}")
}

// Simple recursive (NOT tail recursive - can cause stack overflow for large n)
def fibonacci(n: Int): Int = {
  if (n <= 1) n
  else fibonacci(n - 1) + fibonacci(n - 2)
}

// Tail-recursive version using accumulators
def fibonacciTailRec(n: Int): Int = {
  @annotation.tailrec
  def loop(n: Int, prev: Int, curr: Int): Int =
    if (n == 0) prev
    else loop(n - 1, curr, prev + curr)

  loop(n, 0, 1)
}