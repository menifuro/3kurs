fun main()
{
val inputVal = readln()
    var result = ""
    var countChar = 1

    var previousChar = inputVal[0]

    for (i in 1.. inputVal.length - 1)
    {
    if (inputVal[i] == previousChar){
        countChar++
    } else{
        if (countChar > 1) {
            result = result + previousChar + countChar
        } else {
            result = result + countChar
        }
        countChar = 1
        previousChar = inputVal[i]
    }
    }
    println(result)
}