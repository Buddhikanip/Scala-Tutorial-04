import scala.io.StdIn.readLine

object Q3 extends App(){

  def toUpper(input: String): String = input.toUpperCase()
  def toLower(input: String): String = input.toLowerCase()
  def formatNames(name: String)(fn: String => String): String = fn(name)
//  def cus(name: String) = toUpper(name.substring(0, 2)) + name.substring(2)

    val names:List[String] = readLine().split(",").toList

    println(formatNames(names(0))(toUpper))
    println(formatNames(names(1))((name: String) =>
        toUpper(name.substring(0, 2)) + name.substring(2)
      )
    )
    println(formatNames(names(2))(toLower))
    println(formatNames(names(3))((name: String) =>
        name.substring(0, name.length() - 1) + toUpper(name.substring(name.length() - 1, name.length()))
      )
    )
}
