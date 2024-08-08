function isPrimo(value) {
    if (value < 2)
        return false;
    for (var i = 2; i < value; i++) {
        if (value % i === 0) {
            return false;
        }
    }
    return true;
}
for (var i = 1; i <= 100; i++) {
    if (isPrimo(i))
        console.log('El numero: ', i, ' es primo');
}
