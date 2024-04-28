#include <iostream>

void playTicTacToe(char[3][3]);
using namespace std;

int main() {

    char game[3][3] = {
        {'X', 'O', 'O'},
        {'#', 'X', 'O'},
        {'O', 'X', 'X'}
    };

    cout << "\'X\' is for Player 1\t\'O\' is for Player 2" << endl << endl;

    for(int i = 0; i<3; i++) {
        cout << "| ";
        for(int j=0; j<3; j++) {
            cout << game[i][j] << " | ";
        }
        cout << "\n";
    }

    cout << endl << endl;

    playTicTacToe(game);

    return 0;
}

void playTicTacToe(char game[3][3]) {
    if(game == NULL) return;

    char X = 'X';
    char O = 'O';

    for(int i=0; i<3; i++) {
        //X row
        if( game[i][0] == X && game[i][1] == X && game[i][2] == X ) {
            cout << "Player 1 wins" << endl;
            return;
        }
        //O row
        if( game[i][0] == O && game[i][1] == O && game[i][2] == O ) {
             cout << "Player 2 wins" << endl;
            return;
        }

        //X column
        if( game[0][i] == X && game[1][i] == X && game[2][i] == X ) {
            cout << "Player 1 wins" << endl;
            return;
        }
        //O column
        if( game[0][i] == O && game[1][i] == O && game[2][i] == O ) {
             cout << "Player 2 wins" << endl;
            return;
        }

    }

    if(game[0][0] == X && game[1][1] == X && game[2][2] == X) {
        cout << "Player 1 wins" << endl;
        return;
    }

    if(game[0][2] == X && game[1][1] == X && game[2][0] == X) {
        cout << "Player 1 wins" << endl;
        return;
    }


    if(game[0][0] == O && game[1][1] == O && game[2][2] == O) {
         cout << "Player 2 wins" << endl;
        return;
    }

    if(game[0][2] == O && game[1][1] == O && game[2][0] == O) {
         cout << "Player 2 wins" << endl;
        return;
    }

    cout << "It's a Tie" << endl;

}
