package com.ynassar.datastructures

import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

class MyStackSpec : BehaviorSpec({
    given("a stack") {
        `when`("I push an element") {
            val stack = MyStack<Int>()

            then("I should peek it") {
                stack.push(1)
                stack.peek() shouldBe 1
            }

            then("I should pop it") {
                stack.push(1)
                stack.pop() shouldBe 1
            }

            then("it should be the max") {
                stack.push(1)
                stack.max() shouldBe 1
            }
        }

        `when`("I push an element and pop it") {
            val stack = MyStack<Int>()
            then("stack should be empty") {
                stack.push(1)
                stack.pop()
                stack.isEmpty() shouldBe true
            }
        }
    }
})