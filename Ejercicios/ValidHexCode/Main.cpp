#include <iostream>
#include <regex>
#include <string>

using namespace std;

bool isValidHex(string);

int main() {
    string text = "#000000";

    if(isValidHex(text)) {
        cout << "is valid" << endl;
    } else {
        cout << "is not valid" << endl;
    }

    return 0;
}

bool isValidHex(string hexadecimal) {
    string pattern = "#[A-F|a-f|0-9]{6}";
    regex reg(pattern);

    return regex_match(hexadecimal, reg);
}
