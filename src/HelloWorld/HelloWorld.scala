package HelloWorld

/**
 *
 */
class HelloWorld {
  def hello() : Void = println("Hello world!")
}

object Main extends App {
  val helloWorld = new HelloWorld()
  helloWorld.hello()
}