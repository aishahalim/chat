package HelloActor

import akka.actor.{Props, ActorSystem, Actor}

/**
 * Hello world akka from http://alvinalexander.com/scala/simple-scala-akka-actor-examples-hello-world-actors
 */
class HelloActor(myName: String) extends Actor {
  def receive = {
    case "hello" => println("hello from %s".format(myName))
    case _       => println("'wah?', said %s".format(myName))
  }

}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props(new HelloActor("Fred")), name = "helloactor")

  helloActor ! "hello"
  helloActor ! "buenos dias"
}