package examples

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
            Student("Ginger", 19),
            Student("Michael", 23),
            Student("Maria", 20),
            Student("Joe", 39),
            Student("Bob", 16)
    )
}

fun main(args: Array<String>){
    val students = getStudents()
    val combos = students.map{ a -> a.name + " : " + a.age}
    println("Combos: $combos")

    println("The oldest student : ${students.maxBy{it.age}}")

    val studentsWithLongNames = students.filter{it.name.length > 5}
    println("Long names: $studentsWithLongNames")

    println("The student with the shortest name : ${students.minBy{it.name.length}}")

    // Add your solution here
//    students with shortest names

    val studentWithShortNames = students.filter { it.name.length <5 }

    println("The Student with the shorted names $studentWithShortNames")

}