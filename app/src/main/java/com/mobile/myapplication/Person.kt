package com.mobile.myapplication

open class Person(
    open val name: String,
    val age: Int,
    val gender: String
) {
    fun gotoSchool() {

    }
}

class Children(
    val motherName: String,
    override val name: String,
    val age: Int,
    val gender: String
) : Person(
    name, age, gender
) {}

class CreatePerson() {

    val person = Person("Artem", 16, "men")

    val user = User("asd@qw.sd", "qweqwew")

    fun ageInString(): String {
        person.gotowork()
        person.gotoSchool()
        changePerson(person)
        user.password
        user.userName = "qwe.sd@js.dd"
        return person.age.toString()
    }
}