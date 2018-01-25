import scala.collection.JavaConverters._
import scala.collection.immutable.Range

println("hello World")
val TestS = "Test String"
val testint = 5.234
val testboolean = true
// ASSIGNMENT
//VALUES
var Hello = "Hello World"





println(Hello)
// PARAMETERS
//class TestExercises {

def MethodTest(string: String): String = {
  return string
}
println(MethodTest(TestS))

//RETURN TYPES
def Returntypes(Hello: String): String = {
  return Hello
}
println("RT TEST")
println(Returntypes(Hello: String))

//TYPE INFERENCE
def TypeInference(anyVal: Any): Any = {
  return anyVal
}
println("TYPE INFERENCE TEST")
println(TypeInference(testint: Double))
println(TypeInference(Hello: String))
println(TypeInference(testint: Any))
println(TypeInference(testboolean: Any))

//STRINGS
def stringsTest(string: String, int: Int): String = {
  Hello.takeRight(5)
}
println("Strings Test")
println(stringsTest(Hello, 5))

//STRINGS 2
def stringsTest2(stringParam1: String, stringParam2: String, e: Char, a: Char): String = {
  // NAME CONCAT CON
  val con = stringParam1.concat(stringParam2)
  //CONCAT REPLACE CHARS
  con.replace(e, a)

}
println(" REPLACE LETTERS TEST")
println(stringsTest2("Ha", "llo", 'a', 'e'))

// OPERATORS
def operatorsTest(num1: Int, num2: Int): Int = {
  num1 + num2
}
println("OPERATORS TEST")
println(operatorsTest(10, 25))

//CONDITIONALS + CONDITIONALS2
def conditionalsTest(con1: Int, con2: Int, boolean: Boolean): Int = {
  var output: Int = 0

  if (con1 == 0 && con2 == 0) {
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
println(conditionalsTest(4, 5, false))

//ITERATION
def itterateTest(itString: String, itInt: Int): String = {

  val it = itString * itInt

  return it
}
println(itterateTest("H", 6))


//ITTERATION2
def itter2(rS: String, rI: Int): String = {
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


def itter3(word1: String, word2: String, testNum: Int) = {


  for (i <- 1 to testNum) {

    if (i % 3 == 0) print(word1)
    if (i % 5 == 0) print(word2)
    else if (i % 3 != 0 && i % 5 != 0) print(i)
  }
}
itter3("Fizz", "Buzz", 15)


def methodRecursion1(int1: Int, string1: String): Unit = {

  (if (int1 == 1) 0
  else methodRecursion1(int1 - 1, string1))
  println(string1)
}
print("RECURSION1")
println(methodRecursion1(5, "HI"))

def methodRecusion2(int1: Int, string1: String): Unit = {

  var itTest: String = ""
  if (int1 < 1) {
  }
  else methodRecusion2(int1 - 1, string1)
  itTest = string1 * 5
  println(itTest)

}
print("RECURSION2")
println(methodRecusion2(5, "H"))

def methodRecursion3(int1: Int, string1: String, string2: String): Unit = {
  // string 1 fizz
  //string 2 buzz
  if (int1 < 1) {
  }
  else methodRecursion3(int1 - 1, string1, string2)

  if (int1 % 3 == 0) print(string1)
  if (int1 % 5 == 0) print(string2)
  else if (int1 % 3 != 0 && int1 % 5 != 0) print(int1)

}
print("RECURSION FIZZ BUZZ")
print(methodRecursion3(15, "  Fizz  ", "  Buzz  "))






def hansPeter(cardNumber: String) = {

  val x = cardNumber.reverse.map(_.asDigit)
  println(cardNumber)
  println(x)

  var myString = ""
  for (i <- 0 until x.length by 2) {
    myString = myString + x(i).toString
  }
  var myStringDouble = ""
  for (i <- 1 until x.length by 2) {
    myStringDouble = myStringDouble + (x(i) * 2).toString
  }

  println("BY 1   " + myString)
  println("BY 2   " + myStringDouble)
  // CONVERT TO DIGIT
  val temp = myString.map(_.asDigit)
  val temp2 = myStringDouble.map(_.asDigit)
  // SUM
  val conv1 = temp.sum
  val conv2 = temp2.sum
  // CHECK IF VALID
  val result = conv1 + conv2
  println(result)
  if (result % 10 == 0)
    println("Result Number VALID")
  else
    print("Result Number NOT VALID")
}
println(hansPeter("49927398717"))


// PATTERNMATCHINGGGGGGGG


def conditionals1and2Case(con1: Int, con2: Int, boolean: Boolean): Unit = {

  (con1, con2, boolean) match {

    case case1 if case1._3 == true => println(con1 + con2)
    case case2 if case2._3 == false => println(con1 * con2)
    case case3 if case3._1 == 0 => println(con2)
    case case4 if case4._2 == 0 => println(con1)

  }

}
print(conditionals1and2Case(5,7,true))

val listTest = List(5,8)
val array = Array(34,45)
val tuple = (28,"Bats")

def conditionalsPatternSwap (num1: Any):Any = {
  // ACCEPT ANY TYPE AND GRAB FIRS AND LAST ELEMENT THEN SWAP


  (num1)match
  {
    case (x, y) => (y, x)
    case (x :: y ::_) => (y,x)
    case (Array(x,y)) => Array(y,x)
    case (x,y) => (null)
  }
}

print("SWAP")
println("Numbers")
println(conditionalsPatternSwap(1,2))
println("String")
print(conditionalsPatternSwap("Hello"))
println("List")
print(conditionalsPatternSwap(listTest))
println("Array")
print(conditionalsPatternSwap(array))
print("Tuple")
print(conditionalsPatternSwap(tuple))




