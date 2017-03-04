function maxOfThree(a, b, c){
    final = [a, b, c].sort();
    return final[2];
}

var first = 1,
    second = 5,
    third = -2,
    x = maxOfThree(first, second, third);

document.getElementById("filler").innerHTML += x;