package com.mobile.myapplication


class CreatePersonOnJava {
    var person = Person("Artem", 16, "men")
    val ageOnString: String
        get() {
            person.toString()
            return person.age.toString() + ""
        }
}