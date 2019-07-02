package com.ynassar.recursion

fun <T> Set<T>.subsets(): Set<Set<T>> {
    val res = HashSet<Set<T>>()
    res.add(emptySet())

    for (e in this) {
        (this - e).subsets().forEach {
            with(res) {
                add(it)
                add(it + e)
            }
        }
    }

    return res
}
