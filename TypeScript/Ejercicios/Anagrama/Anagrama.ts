const isAnagram = ( word1: string, word2: string ): boolean => {
    if(word1.toLowerCase().match(word2.toLowerCase())) return false;
    if (word1.length !== word2.length) return false
    
    const wrd1: string[] = word1.toLowerCase().split('').sort();
    const wrd2: string[] = word2.toLowerCase().split('').sort();

    for(let i = 0; i<wrd1.length; i++) {
        if(wrd1[i] !== wrd2[i]) return false
    }

    return true;
}

console.log(isAnagram('Hola', 'Aloh'))
console.log(isAnagram('Saco', 'caso'))
console.log(isAnagram('Hola', 'mundo'))
console.log(isAnagram('Hola', 'Adrian'))
console.log(isAnagram('caso', 'caso'))
console.log(isAnagram('ALOH', 'HOLA'))