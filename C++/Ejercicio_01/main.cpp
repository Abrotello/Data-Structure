#include <iostream>
#include <unordered_set>

/*
 Dado un metodo que recibe un String, comprobar si todos los caracteres son unicos o no
 
  isUnique("abcde") => true
  isUnique("abcded") => false
*/

bool isUnique(char[]);
using namespace std;

int main(int argc, const char * argv[]) {
    char word1[] = {'a','b','c','d','e','z'};
    char word2[] = {'a','b','c','d','e','a'};
    
    cout << isUnique(word1) << endl;
    cout << isUnique(word2) << endl;
    return 0;
}

bool isUnique(char *ptr_string) {
    
    unordered_set<char> table;
    
    for(int i=0; *(ptr_string+i) != '\0'; i++) {
        if(table.count(*(ptr_string+i)) != 0) return false;
        table.insert(*(ptr_string+i));
    }
    return true;
}

