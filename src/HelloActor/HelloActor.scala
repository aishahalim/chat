package HelloActor

import akka.actor.{Props, ActorSystem, Actor}

/**
 * Hello world akka from http://alvinalexander.com/scala/simple-scala-akka-actor-examples-hello-world-actors
 */
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at ya")
    case _       => println("wah?")
  }

}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  helloActor ! "hello"
  helloActor ! "buenos dias"
}