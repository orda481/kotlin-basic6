package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите первую цифру: ")
    val num1 = readln().toInt()
    print("Введите вторую цифру: ")
    val num2 = readln().toInt()
    if (num1 <0 || num2 < 0 || num1 > 9 || num2 > 9) {
        println("Ошибка! Введите цифру!")
        return
    }
    if (num1 == num2) {
        println("Ошибка! цифры должны быть разными!")
        return
    }
    if (num1 % 2 != 0) {
        if (num2 == 0) {
            println("Нечётное число: $num1")
        } else {
            println("Нечётное число: $num2$num1")
        }
    } else if (num2 % 2 != 0) {
        if (num1 == 0) {
            println("Нечётное число: $num2")
        } else {
            println("Нечётное число: $num1$num2")
        }
    } else {
        println("Создать нечетное число невозможно(")
    }
}