var isAnagram = function (word1, word2) {
    if (word1.toLowerCase().match(word2.toLowerCase()))
        return false;
    if (word1.length !== word2.length)
        return false;
    var wrd1 = word1.toLowerCase().split('').sort();
    var wrd2 = word2.toLowerCase().split('').sort();
    for (var i = 0; i < wrd1.length; i++) {
        if (wrd1[i] !== wrd2[i])
            return false;
    }
    return true;
};
console.log(isAnagram('Hola', 'Aloh'));
console.log(isAnagram('Saco', 'caso'));
console.log(isAnagram('Hola', 'mundo'));
console.log(isAnagram('Hola', 'Adrian'));
console.log(isAnagram('caso', 'caso'));
console.log(isAnagram('ALOH', 'HOLA'));
