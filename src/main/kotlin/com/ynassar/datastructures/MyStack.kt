package com.ynassar.datastructures

class Node<T : Comparable<T>>(val data: T, var max: T = data, var next : Node<T>? = null)

class MyStack<T : Comparable<T>> {
    private var head: Node<T>? = null

    fun peek() = head?.data

    fun push(d: T) {
        val max = head?.max ?: d
        head = Node(d, if(max > d) max else d, head)
    }

    fun pop() : T? {
        val d = head?.data
        head = head?.next
        return d
    }

    fun max() = head?.max

    fun isEmpty() = head == null
}