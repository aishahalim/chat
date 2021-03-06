package Messaging

import akka.actor.{Props, ActorSystem, Actor}

/**
 * Hello world akka from http://alvinalexander.com/scala/simple-scala-akka-actor-examples-hello-world-actors
 */
class Messaging(myName: String) extends Actor {
  def receive = {
    case "hello" => "hello from %s".format(myName)
    case _       => "'wah?', said %s".format(myName)
  }

}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val helloMessage = system.actorOf(Props(new Messaging("Fred")), name = "helloactor")

  println(helloMessage ! "hello")
  println(helloMessage ! "buenos dias")
}