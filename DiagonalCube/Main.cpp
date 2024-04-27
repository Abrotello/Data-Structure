#import <iostream>
#import <cmath>

using namespace std;

double getMainDiagonal(double);

int main() {
    double volume = 0;
    cout << "Volumen de un Cubo: "; cin >> volume;
    double result = round(getMainDiagonal(volume) * 100) / 100;
    cout << "Result: " << result;
    return 0;
}

double getMainDiagonal(double volume) {
    double side = pow(volume, 1.0/3.0);
    double secondDiagonal = sqrt((side*side + side*side));
    double firstDiagonal = sqrt((side*side + secondDiagonal*secondDiagonal));

    return firstDiagonal;
}
