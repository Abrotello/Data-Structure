function isPrimo(value: number): boolean {
    if (value < 2) return false

    for(let i = 2; i < value; i++) {
        if(value % i === 0) {
            return false
        }
    }
    return true;
}

for(let i=1; i<=100; i++) {
    if(isPrimo(i)) console.log('El numero: ', i, ' es primo')
}