#include <iostream>

void makeBox(int);
using namespace std;

int main() {
    int dimensions = 0;
    cout << "Type the dimensions: "; cin >> dimensions;
    makeBox(dimensions);

    return 0;
}

void makeBox(int dimensions) {

    if(dimensions < 0) return;
    if(dimensions == 1) cout << "#";

    char box[dimensions][dimensions];

    for(int i=0; i<dimensions; i++) {
        for(int j=0; j<dimensions; j++) {
            if(j == 0 || j == dimensions-1 || i == 0 || i == dimensions-1) {
                box[i][j] = '#';
            } else {
                box[i][j] = ' ';
            }
            cout << box[i][j];
        }
        cout << endl;
    }
}
