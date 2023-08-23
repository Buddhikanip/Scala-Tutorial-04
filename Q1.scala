import scala.io.StdIn.readLine

object Q1 extends App(){
  def flat(interest:Double) = interest match{
    case x if(interest <= 20000) => interest *2/100
    case x if(interest <= 200000) => interest *4/100
    case x if(interest <= 2000000) => interest *3.5/100
    case _ => interest * 6.5/100
  }
  print("Enter deposit amount : ")
  var interest:Double = readLine().toDouble
  println("Deposit amaount is : " + interest + "\nEarnings : "+ flat(interest) + "\nTotal : " +(interest+flat(interest)) )
}

// Test repo commit