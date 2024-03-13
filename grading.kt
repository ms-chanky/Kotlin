fun main(){
    var math: Int = 7
    var biology: Int = 6
    var physics: Int = 3
    var chemistry: Int = 5
//.................................................
    var sum = math + biology + physics + chemistry
    if (sum>400) {
        print("Invalid")
    }
        else{
            println("Total marks = $sum")
    }
    //..................................
    var average = sum/4
    if (average>100) {
        print("Invalid")
    }
    else{
        println("Average = $average")
    }
//......................................
    if (average > 100){
        println("Invalid")
    }
    else if (average >= 75){
        println("Grade is A")
    }
    else if (average >= 50){
        println("Grade is B")
    }
    else if (average >= 25){
        println("Grade is C")
    }
    else if (average >= 15){
        println("Grade is D")
    }
    else if (average >= 0){
        println("Failed")
    }
    else {
        println("Invalid")
    }





}