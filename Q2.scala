import scala.io.StdIn.readLine

object Q2 extends App(){
  def patt(x:Int) = x match {
    case x if(x<=0) => "Negative"
    case x if(x%2 == 0) => "Even"
    case _ => "Odd"
  }
  print("Enter a number : ")
  val num = readLine().toInt
  println(num + " is a " + patt(num) + " value.")
}
