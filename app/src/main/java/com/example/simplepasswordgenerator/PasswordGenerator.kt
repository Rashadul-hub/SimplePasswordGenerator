package com.example.simplepasswordgeneratorn

class PasswordGenerator {
    private val charaters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=[{]}|~`;:'"

    fun generatePassword(length : Int , specialWord : String= ""): String{

        val stringBuilder = StringBuilder(length)

        for (x in 0 until length){
            //Create a new random character & connected to StringBuilder
            val random = (charaters.indices).random()
            stringBuilder.append(charaters[random])
        }
        stringBuilder.insert((0 until length).random(), specialWord)
        return stringBuilder.toString()
    }
}