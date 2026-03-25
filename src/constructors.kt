class employee(var fullname: String, var position: String) {



}

fun main() {
    var employee1 = employee("Ken Mwenda","MD")
    var employee2 = employee("Ivy Helen","HR")
    println(employee1.fullname)
    println(employee1.position)
    println(employee2.fullname)
    println(employee2.position)
}