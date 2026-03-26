fun main() {


    //while loop

    var number = 200

    while (number <= 205){
        println("Number : $number")
        number ++
    }

    //for loop

    for (num in 10..15){
        println("Number is $number")
    }



    for (letter in 'a'..'d'){
        println("Letter : $letter")
    }

    var cars = arrayOf("Toyota", "Mercedes", "Volvo")

    for (car in cars){
        println("Car is $car")
    }

    for (a in 10..20){
        if (a==16){
            break
        }
        println("number is $a")
    }
for(x in 25..45){
    if (x==30){
        continue
    }
    println("number is $x")
}
















































































}