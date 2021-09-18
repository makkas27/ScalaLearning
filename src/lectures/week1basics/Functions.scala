package lectures.week1basics

object Functions extends App{
  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }

  def bPerson(name: String, surname: String): Unit = println(s"$name $surname")

  def aParameterlessFunction(): Unit = println("Function with no parameters")

  aParameterlessFunction()
  aParameterlessFunction

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter

  def callByValue(x: Long): Unit = { //вычисляет значение аргументов перед вызовом функции
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = { //вычисляет значение аргумента непосредственно во время использования его в функции
    //если значение не используется в функции, то оно не будет вычислятся
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def aBossFunction(): String = {
    def aHelperFunction(): String = "I'm here to help"

    aHelperFunction()
  }
}
