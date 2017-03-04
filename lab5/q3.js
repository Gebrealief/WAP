function cOrNot(c){
    var vowels = ['a', 'e', 'i', 'o', 'u'];
    
    if(vowels.indexOf(c, 0) === -1) return false;
    return true;

}

var chr = 'a',
    x = cOrNot(chr);

document.getElementById("filler").innerHTML += x;