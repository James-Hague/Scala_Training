import scala.collection.JavaConverters._
import scala.collection.immutable.Range

println ("hello World")
// ASSIGNMENT
//VALUES
var Hello = "Hello World"
val TestS = "Test String"
val testint = 5.234
val testboolean = true





println(Hello)
// PARAMETERS
//class TestExercises {

  def MethodTest (string: String):String = {
    return string
  }
  println(MethodTest(TestS))

  //RETURN TYPES
  def Returntypes (Hello: String):String = {
    return Hello
  }
  println("RT TEST")
  println(Returntypes(Hello: String))

  //TYPE INFERENCE
  def TypeInference (anyVal: Any):Any = {
    return anyVal
  }
println("TYPE INFERENCE TEST")
println(TypeInference(testint: Double))
println(TypeInference(Hello: String))
println(TypeInference(testint: Any))
println(TypeInference(testboolean: Any))

  //STRINGS
  def stringsTest (string: String,int: Int):String = {
    Hello.takeRight(5)
  }
    println("Strings Test")
    println(stringsTest(Hello, 5))

//STRINGS 2
  def stringsTest2 (stringParam1: String,stringParam2: String,e: Char,a: Char):String = {
    // NAME CONCAT CON
    val con = stringParam1.concat(stringParam2)
    //CONCAT REPLACE CHARS
    con.replace(e,a)

  }
println(" REPLACE LETTERS TEST")
  println(stringsTest2("Ha","llo",'a','e'))

// OPERATORS
def operatorsTest (num1: Int,num2: Int): Int = {
  num1 + num2
}
println("OPERATORS TEST")
println(operatorsTest(10,25))

//CONDITIONALS + CONDITIONALS2
def conditionalsTest (con1: Int,con2: Int,boolean: Boolean):Int = {
  var output: Int = 0

  if (con1 == 0 && con2 == 0){
    output = 0
  }
  else if (boolean == true) {
     output = con1 + con2
  }
  else {
     output = con1 * con2
  }
return output
}
println(conditionalsTest(4,5,false))

//ITERATION
def itterateTest (itString: String,itInt: Int):String = {

  val it = itString * itInt

  return it
}
println(itterateTest("H",6))


//ITTERATION2
def itter2 (rS: String,rI: Int): String = {
  // first sum
  var itTest: String = ""
  for (i <- 1 to rI) {
    for (i <- 1 to rI) {
      itTest += rS
    }
    itTest += "\n"
  }
  itTest
}
print("ITT2 TEST")
println(itter2("H", 3))


def itter3 (word1: String,word2: String,testNum: Int) = {


  for (i <- 1 to testNum) {

    if (i % 3 == 0) print(word1)

    if (i % 5 == 0) print(word2)

    else if (i % 3 != 0 && i % 5 != 0) print(i)


  }
}
  itter3("Fizz","Buzz",15)



def conditionalsCase (con1: Int,con2: Int,boolean: Boolean):Unit = {

  (con1, con2, boolean) match {

    case case1 if case1._3 == true => println(con1 + con2)
    case case2 if case2._3 == false => println(con1 * con2)
    case case3 if case3._1 == 0 => println(con2)
    case case4 if case4._2 == 0 => println(con1)

  }
}
println(conditionalsCase(0,0,boolean = false))



def conditionalsSwap (int1: Int,int2: Int) = {

  val list1 = List(int1,int2)

  (int1,int2,list1) match {
    case case1 if case1._3 == (int1,int2) => println(list1)
    case case2 if case2._1 == 0 => print(list1, "invalid")
    case case3 if case3._2 == 0 => print(list1, "invalid")

  }
}
println("CONDIT SWAP TEST")
println(conditionalsSwap(1,2))

 def hansPeter (cardNumber: Long):Unit = {

   val doubleTest = Double
   val sum1 = Int
   val sum2 = Int
   val x = cardNumber


   // list of digits
   //x.toString.reverse.map(_.asDigit).toList
  // println(x)
   x.toString.reverse



   for (i <- 0 to Array(x).length by 2) {
     //Double digit
     val temp = i * 2
     println(temp)
   }
     // add i to list

 }
println(hansPeter(49927398716l))























