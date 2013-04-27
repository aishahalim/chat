package Messaging

import org.scalatest.FunSuite
import akka.actor.{Props, ActorSystem}

/**
 *
 */
class MessagingTest extends FunSuite {
  test("1 is not 2") {
    assert(1 != 2)
  }

  test("1 is reflexive") {
    assert(1 === 1)
  }

  test("Messaging when receiving a hello should print hello from Self") {
    val returnMessage = ActorSystem("TestSystem").actorOf(Props(new Messaging("Self"))) ! "hello"
    assert("hello from Self" === returnMessage)
  }
}
