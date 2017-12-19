package kattis

fun main(args : Array<String>) {
    var line = readLine()
    while (line != null) {
        val (a, b) = line.split(' ')
        println(Math.abs(a.toLong() - b.toLong()))
        line = readLine()
    }
}