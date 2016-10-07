package projecteuler1

import scala.io.StdIn.readLine

/*
Sample Input

2
10
100
Sample Output

23
2318
 */
object ProjectEuler1 {
  def nReadLineInts(n: Int): Seq[Int] = {
    Range(0, n).map(x => readLine).map(_.toInt)
  }

  def fizzBuzz(n: Int): Seq[Int] = {
    Range(0, n).filter(x => x % 3 == 0 || x % 5 == 0)
  }

  def main(args: Array[String]) {
    val n: Int = readLine().toInt
    val ints = nReadLineInts(n)

    val res = ints.map(x => fizzBuzz(x).sum).map(println)
  }
}
