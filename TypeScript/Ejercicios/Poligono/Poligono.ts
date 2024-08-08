interface Poligono {
    area(): number,
    imprimirArea(): void,
}

class Triangulo implements Poligono {
    private base: number
    private altura: number

    constructor(base: number, altura: number) {
        this.base = base
        this.altura = altura
    }
    
    area(): number {
        return (this.base * this.altura) / 2;
    }

    imprimirArea(): void {
        console.log("El area del Triangulo es: ", this.area())    
    }
}

class Rectangulo implements Poligono {
    private base: number
    private altura: number

    constructor(base: number, altura: number) {
        this.base = base
        this.altura = altura
    }
    
    area(): number {
        return (this.base * this.altura);
    }

    imprimirArea(): void {
        console.log("El area del Rectangulo es: ", this.area())    
    }
}

class Cuadrado implements Poligono {
    private lado: number

    constructor(lado: number) {
        this.lado = lado
    }
    
    area(): number {
        return (this.lado * this.lado);
    }

    imprimirArea(): void {
        console.log("El area del Cuadrado es: ", this.area())    
    }
}

function area(poligono: Poligono): number {
    poligono.imprimirArea()
    return poligono.area()
}

const triangulo = new Triangulo(3, 5);
const cuadrado = new Cuadrado(5);
const rectangulo = new Rectangulo(10, 2);

area(triangulo)
area(cuadrado)
area(rectangulo)

