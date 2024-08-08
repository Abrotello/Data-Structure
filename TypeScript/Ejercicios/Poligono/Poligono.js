var Triangulo = /** @class */ (function () {
    function Triangulo(base, altura) {
        this.base = base;
        this.altura = altura;
    }
    Triangulo.prototype.area = function () {
        return (this.base * this.altura) / 2;
    };
    Triangulo.prototype.imprimirArea = function () {
        console.log("El area del Triangulo es: ", this.area());
    };
    return Triangulo;
}());
var Rectangulo = /** @class */ (function () {
    function Rectangulo(base, altura) {
        this.base = base;
        this.altura = altura;
    }
    Rectangulo.prototype.area = function () {
        return (this.base * this.altura);
    };
    Rectangulo.prototype.imprimirArea = function () {
        console.log("El area del Rectangulo es: ", this.area());
    };
    return Rectangulo;
}());
var Cuadrado = /** @class */ (function () {
    function Cuadrado(lado) {
        this.lado = lado;
    }
    Cuadrado.prototype.area = function () {
        return (this.lado * this.lado);
    };
    Cuadrado.prototype.imprimirArea = function () {
        console.log("El area del Cuadrado es: ", this.area());
    };
    return Cuadrado;
}());
function area(poligono) {
    poligono.imprimirArea();
    return poligono.area();
}
var triangulo = new Triangulo(3, 5);
var cuadrado = new Cuadrado(5);
var rectangulo = new Rectangulo(10, 2);
area(triangulo);
area(cuadrado);
area(rectangulo);
