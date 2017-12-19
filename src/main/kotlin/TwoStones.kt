package kattis

import java.math.BigInteger

fun main(args : Array<String>) {
    var line: BigInteger = BigInteger(readLine())
    if (line.rem(BigInteger.valueOf(2L)) == BigInteger.ZERO) println("Bob") else println("Alice")

}